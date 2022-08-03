package com.opps;

public class Composition
{
    public static void main(String[] args) {
        ComputerProcessor computerProcessor=new ComputerProcessor();
        computerProcessor.cores=4;
        computerProcessor.speed="45Hz";


        Computer computer=new Computer("12GB","1TB","HD",computerProcessor);
        System.out.println(computer.computerProcessor.cores);
    }
}

class Computer{
    public String ram;
    public String hardDisk;
    public String screenType;
    ComputerProcessor computerProcessor=new ComputerProcessor();

    public Computer(String ram, String hardDisk, String screenType, ComputerProcessor computerProcessor) {
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.screenType = screenType;
        this.computerProcessor = computerProcessor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + ram + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", screenType='" + screenType + '\'' +
                ", computerProcessor=" + computerProcessor +
                '}';
    }
}
class ComputerProcessor{
    String speed;
    int cores;

    public ComputerProcessor() {
    }

    @Override
    public String toString() {
        return "ComputerProcessor{" +
                "speed='" + speed + '\'' +
                ", cores=" + cores +
                '}';
    }


}