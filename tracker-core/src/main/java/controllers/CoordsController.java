package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoordsController {





    @RequestMapping(value = "/coords")
    public String setCoords(){
        CoordsResponse coordsResponse = new CoordsResponse();
       return coordsResponse.getCoords();
    }

}