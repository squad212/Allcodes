package com.humana.dhp.dhppocs.hhh.company.PassByValue;

public class PassByValueTest {
    public static void main(String[] args) {
    PassByValue1 pb = new PassByValue1();
    StudentClass s1 = new StudentClass();
    StudentClass s2 = new StudentClass();
        System.out.println(s1.age);
        System.out.println(s1.age);
        System.out.println(s1.grade);
        System.out.println(s2.name);
        pb.test(s1, s2);
        //return type handling
        boolean result = pb.test(s1, s2);
        System.out.println(s1.age);
        System.out.println(s2.grade);
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
