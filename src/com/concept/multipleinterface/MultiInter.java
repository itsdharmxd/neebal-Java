package com.concept.multipleinterface;

public class MultiInter implements Ainter,Binter{
    @Override
    public void func() {
        System.out.println( Ainter.dataValue);    // To resolve ambiguity
        System.out.println("single func");
    }

    @Override
    public void singing() {

    }
}
class Main {
    public static void main(String[] args) {
        MultiInter multiInter=new MultiInter();

    }
}
