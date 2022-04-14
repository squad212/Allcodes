//package com.humana.dhp.dhppocs.AmericanAirlines.Controller;
//
//import com.aa.ct.seats.notification.service.InstantNotificationService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.util.StringUtils;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@Slf4j
//@RequestMapping("/cneRequest")
//public class TestController {
//    @Autowired
//    InstantNotificationService instantNotificationService;
//
//    @PostMapping(value = "/sendRequest")
//    public void sendCneRequest(@RequestBody XmlRequest xmlRequest){
//        if (StringUtils.isEmpty(xmlRequest)){
//            throw new IllegalArgumentException("xmlString is Empty");
//        }
//        try{
//            log.info("Request received with xmlRequest:{}", xmlRequest);
//            instantNotificationService.asyncSendNotification(xmlRequest.getXmlRequest());
//
//        }catch(Exception e){
//            log.error("Unable process the xmlRequest:{}", xmlRequest);
//        }
//    }
//    @GetMapping(value="/checkHealth")
//    public String health(){
//        return "Service is Up";
//    }
//}