package com.humana.dhp.dhppocs.hhh.company.Constructor;

public class Grocery {
    String vegetable = "Cauliflower";
    String coldDrink = "Coke";
    int water = 10;
    short electricityBill = 32444;


    public Grocery( String v){
        System.out.println("1st Constructor");
        vegetable= v;
    }
    public Grocery(int w){
        System.out.println("2nd Constructor");
        water = w;
    }

//    public Grocery( String v, int w) {
//        this(vegetable);
//        System.out.println("2nd Constructor");
//        water = w;
//    }
//        public Grocery( String v, int w, short e){
//            this(vegetable,w);
//            System.out.println("3rd Constructor");
//            electricityBill = e;
//        }


    /**
     * Method
     * @a+b
     */
    public int add(int a, int b){
        return a+b;
    }
}
