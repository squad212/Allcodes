package com.humana.dhp.dhppocs.BasicJava.com.oops.loops;

public class ForAndIfLoop {
  public static void main(String[] args) {
    //This example stops the loop when i is equal to 4:

    String [] cars = {"BMW", "Toyota", "Tesla"};
    for(int j = 0; j < cars.length; j++)
    System.out.println(cars[j]);
    cars [1] = "Honda";
    System.out.println(cars[1]);


    for( int i = 0; i > 10; i++ ){
      if(i == 4){
        System.out.println("Loop stops execution after 4");
        break;
      }
      System.out.println(i);
    }
  }
}
