package com.humana.dhp.dhppocs.SpringFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddToCart {
    @Autowired
    CartDetails cartDetails;

    @RequestMapping(value = "/add2Cart", method = RequestMethod.GET)
    public String add2Cart(@RequestParam String product){
        String addedItems= cartDetails.addItem(product);
        return addedItems;
    }
}
