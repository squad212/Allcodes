package com.humana.dhp.dhppocs.WebService;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class MathCal {
    Logger log= Logger.getLogger("MathCal");

    @RequestMapping(value = "/areaOfRectangle", method = RequestMethod.POST,
            consumes= MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Output AreaOfRectangle(@RequestBody Input in){
        Output o = new Output();
        o.areaOfCircle = 3.2* in.radius* in.radius;
                return o;
    }

}
