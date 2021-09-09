package com.humana.dhp.dhppocs.Restful;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Math {
    @RequestMapping(value = "/add/10/20", method = RequestMethod.GET)
    public int add(@PathVariable int a, @PathVariable int b){
        int add = a + b;
        return add;
    }

    public static void main(String[] args) {

    }
}
