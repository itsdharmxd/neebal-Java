package com.concept.interfaceuse;

public class Main {
    public static void main(String[] args) {
        Phone samsumg=new Samsumg();
        samsumg.battery();;
        samsumg.callerTune();
        samsumg.Rings();

        System.out.println("'''''''''''''''''''");
        Phone iphone=new Iphone();
        iphone.Rings();
        iphone.battery();
        iphone.callerTune();
    //    iphone.extra();   // will not work as container is a parent type
    }
}
