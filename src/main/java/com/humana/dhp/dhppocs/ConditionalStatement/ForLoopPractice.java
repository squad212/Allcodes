package com.humana.dhp.dhppocs.ConditionalStatement;

public class ForLoopPractice {
    public void printNumber(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(10);
            System.out.println(n);
            System.out.println(i);
        }}
        public void printMultiplication(int x){
        for ( int i = 1; i<=x; i++){
            System.out.println(String.format("%d * %d = %d", x, i,x*i));
            System.out.println(String.format("%d * %d = %d", 5, i,5*i));
        }
        }
        public int multiplyThreeNumber(int angle1, int angle2){
        int angle3 = 180 - (angle1 + angle2);
            return angle3;
        }
    public static void main(String[] args){
       ForLoopPractice flp = new ForLoopPractice();
       flp.printNumber(1);
       flp.printMultiplication(11);
       //handling return type
        int angle3 = flp.multiplyThreeNumber(20, 40);
        System.out.println(angle3);


    }
}
