package rest_template;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

@Service
@EnableScheduling
public class RestResponse {
        private static final Logger log = LoggerFactory.getLogger(RestResponse.class);
        private BlockingDeque<String> queue = new LinkedBlockingDeque<>(100);

        @Scheduled(fixedDelay = 2_000)
        void take() throws InterruptedException {
                log.info(queue.take());
                //System.out.println("Taking coords");
                //System.out.println((current - previous) + " ScheduledQueueService.take " + queue.poll(500, TimeUnit.MILLISECONDS));
                //System.out.println( "Current coordinates " + queue.take());
        }

        @Scheduled(fixedDelay = 1_000)
        void put() throws InterruptedException, IOException {
                //CoordsResponse response = new CoordsResponse();
                //System.out.println("Putting coordinates ");
                String response = IOUtils.toString(new URL("http://localhost:8080/relay"), "UTF8");
                queue.put(response);
        }
}
