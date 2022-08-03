package com.concept.interfaceuse;

public class Iphone implements Phone{
    @Override
    public void Rings() {
        System.out.println("Ringing");
    }

    @Override
    public void callerTune() {
        System.out.println("Laila ");
    }

    @Override
    public void battery() {
        System.out.println("12000Mah");
    }
    public  void extra(){
        System.out.println("extra features");
    }
}
