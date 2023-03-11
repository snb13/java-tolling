package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTemplateController {
    @Autowired
    RestTemplate restTemplate;

        @RequestMapping("/relay")
        public String relay(){
            Product prod = new Product();
            String product = restTemplate.getForObject(prod.generateURL(), String.class);
            return product;
    }

}
