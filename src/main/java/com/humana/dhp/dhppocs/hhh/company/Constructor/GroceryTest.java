package com.humana.dhp.dhppocs.hhh.company.Constructor;

public class GroceryTest {
    public static void main(String[] args) {
        Grocery gg = new Grocery(2);
        System.out.println(gg.water);
    Grocery g = new Grocery( "Cabbage");
    Grocery g1 = new Grocery("Okra");
    Grocery g2 = new Grocery("Zuchini");
        System.out.println(g.vegetable);
        System.out.println(g1.vegetable);
        System.out.println(g2.vegetable);
    Student s= new Student("Brutin", 21);

        System.out.println("Name: " + s.name + ", age:" + 21);
      int x=g.add(5,5);
        System.out.println(x);

    }

}
