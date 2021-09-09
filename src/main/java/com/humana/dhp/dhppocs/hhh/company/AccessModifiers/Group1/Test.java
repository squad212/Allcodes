package com.humana.dhp.dhppocs.hhh.company.AccessModifiers.Group1;

public class Test {
    int a;
    public int b;
    private int c;
    protected int d;//it is accessed by only this program.
                    // not accessiable even inside the same package or related programs

    public void add(){

        System.out.println("print this method");
    }

}
