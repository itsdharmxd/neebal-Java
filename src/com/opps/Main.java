package com.opps;

public class Main {

     static public void main(String[] args) {
          Car car =new Car("door","engine","driver",34);
        System.out.println(car.toString());

        car.setDoors("closed");
        car.setEngine("on");
        car.setSpeed(34);
        car.setDriver("Dharmesh Upadhyay");
        System.out.println(car.run());

    }

}
