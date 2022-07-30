package com.humana.dhp.dhppocs.BasicJava.com.oops.Encapsulation;

public class Earth {
    Earth livingCreature = new Earth();
    Earth plant = new Earth();
    Earth nonLivingThings = new Earth();
    public void species(){
        livingCreature.species();
    }
    /**
     * We can invoked a method of a class by an object
     * action methods define actions that can be performed on classes,
     * and to invoke(calling) a method which is present inside a class,
     * we would need to use an object.
     */

}
 class Country {

     public void comingSoon(){
        System.out.println("Coming Soon");
         //System.out.printf().println;

    }

    public static void main(String[] args) {
        /**
         * We can create as many as instance or object of a Class
         * and use that invoke method using that new object
         */
        Country c = new Country();
        Country usa = new Country();
        Country nepal = new Country();
        Country india = new Country();
        c.comingSoon();
        usa.comingSoon();
        nepal.comingSoon();
        india.comingSoon();
    }

}
class Mulitplication{
    public void multiply(){
        for (int i = 1; i<=10; i++){
            System.out.println(String.format("%d * %d = %d", 5, i, 5*i));
        }
    }
    public void multiply(int table) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(String.format("%d * %d = %d", table, i, table * i));
//        }
        /**
         * we can call another method from here as well passing the parameter
         * its taking the arguments
         */

        multiply(table, 0, 10);
    }
    public void multiply(int table, int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.println(String.format("%d * %d = %d", table, i, table * i));
        }
    }

    public static void main(String[] args) {
        Mulitplication mul = new Mulitplication();
        mul.multiply();
        mul.multiply(3);
        mul.multiply(1,3,10);

    }

}

