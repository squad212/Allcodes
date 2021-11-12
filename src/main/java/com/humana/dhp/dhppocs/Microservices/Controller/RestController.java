package com.humana.dhp.dhppocs.Microservices.Controller;


import com.humana.dhp.dhppocs.Microservices.Response.GreetingResponse;
import com.humana.dhp.dhppocs.Microservices.Service.RestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor
@RequestMapping("microservice/v1")
@Slf4j
public class RestController {

    @Autowired
    RestService restService;

    @GetMapping (value = "/greeting", produces = "application/json")
    public GreetingResponse getGreeting(@RequestParam ("name") String name){
        String message = restService.buildMessage(name);
    return GreetingResponse.builder().greeting(message).build();
    }

    @GetMapping (value = "/getDrugInfo", produces = "application/json")
    public String getDrugInfo(@RequestParam String name){
        String msg= restService.msg(name);
        return msg;
    }

}



