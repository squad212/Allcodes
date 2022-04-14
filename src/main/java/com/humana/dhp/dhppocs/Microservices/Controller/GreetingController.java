package com.humana.dhp.dhppocs.Microservices.Controller;



import com.humana.dhp.dhppocs.Microservices.Model.GreetingResponse;
import com.humana.dhp.dhppocs.Microservices.Service.RestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class GreetingController {

    @Autowired
    RestService restService; // Basically it will autowire all the dependency for the object of the service class

    @GetMapping(value = "/greeting", produces = "application/json")
    public GreetingResponse greeting(@RequestParam String name){
        String nam = restService.buildMessage(name); //initialization of new variable
        return GreetingResponse.builder().greeting(name).build();
    }














//
//    @Autowired
//    RestService restService;
//
//    @GetMapping (value = "/greeting", produces = "application/json")
//    public GreetingResponse getGreeting(@RequestParam ("name") String name){
//        String message = restService.buildMessage(name);
//    return GreetingResponse.builder().greeting(name).build();
//    }
//
//    @GetMapping (value = "/getDrugInfo", produces = "application/json")
//    public String getDrugInfo(@RequestParam String name){
//        String msg= restService.msg(name);
//        return msg;
//    }

}



