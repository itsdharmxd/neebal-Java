package com.opps;

public class Car {
     private String doors;

    public Car(String doors, String engine, String driver, int speed) {
        this.doors = doors;
        this.engine = engine;
        this.driver = driver;
        this.speed = speed;
    }

    private String engine;
     private String driver;
     private int speed;

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors='" + doors + '\'' +
                ", engine='" + engine + '\'' +
                ", driver='" + driver + '\'' +
                ", speed=" + speed +
                '}';
    }

    public boolean run(){
        if(doors.equals("closed")&&engine.equals(("on"))){
            return  true;
        }else{
            return false;
        }
    }

}
