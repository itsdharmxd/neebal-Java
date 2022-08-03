package com.opps;

public class InheritanceClass {

    public static void main(String[] args) {
         SportsCar sc=new SportsCar(123,34,4,2);
        Vehicle vehicle =new Vehicle(23,34,4);
        sc.Speed=vehicle.Speed;


        System.out.println(sc.toString());






    }


}
class Vehicle {
    int Speed;
    int Mileage;

    public Vehicle(int speed, int mileage, int seats) {
        Speed = speed;
        Mileage = mileage;
        this.seats = seats;
    }

    int seats;
}
class SportsCar extends Vehicle {
     int Boosters;

    public SportsCar(int speed, int mileage, int seats, int boosters) {
        super(speed, mileage, seats);
        Boosters = boosters;
    }

    @Override
    public String toString() {

        return "SportsCar{" +
                "Boosters=" + Boosters +
                ", Speed=" + Speed +
                ", Mileage=" + Mileage +
                ", seats=" + seats +
                '}';
    }
}
