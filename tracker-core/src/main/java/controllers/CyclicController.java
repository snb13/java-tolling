package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CyclicController {

    @RequestMapping(value = "/cyclic", method = RequestMethod.GET)
    public Response setCoords(@RequestParam(value="location") String location){
        System.out.println(location);
        Response response;
        if (location.split(",").length == 2) {
            response = new Response("ok", true);
        } else {
            response = new Response("fail", false);
        }

        return response;
    }

}
