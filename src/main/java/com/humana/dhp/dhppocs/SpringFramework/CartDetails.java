package com.humana.dhp.dhppocs.SpringFramework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;



public class CartDetails {
 public ArrayList<String> cart = new ArrayList<String>();


 public String addItem(String product){
     cart.add(product);
     return cart.toString();
     //toString() method returns the String representation of the object

 }

}
