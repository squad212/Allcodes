package com.humana.dhp.dhppocs.hhh.company.PassByValue;

public class PassByValue1 {
    public boolean test(StudentClass sc1, StudentClass sc2){
        int a = 20;
        sc1.age = 21;
        sc2.age =22;
        sc2.grade = 11;
        sc2.name = "Brutin";
        return true;
    }
}
