package com.concept.interfaceuse;

public class Samsumg implements Phone{

    @Override
    public void Rings() {
        System.out.println("Ringing");
    }

    @Override
    public void callerTune() {
        System.out.println("Kajrare-kajrare");
    }

    @Override
    public void battery() {
        System.out.println("5000mah");
    }
}
