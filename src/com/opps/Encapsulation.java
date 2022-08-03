package com.opps;

public class Encapsulation {

    public static void main(String[] args) {
    Encap encap=new Encap(23,"dharmesh",3.3f);

        System.out.println(encap.getData1());
        System.out.println(encap.getData2());
        System.out.println(encap.getData3());
    }


}
class Encap{
   private   int data1;
   private   String data2;
   private   float data3;


    public int getData1() {
        return data1;
    }

    public String getData2() {
        return data2;
    }

    public float getData3() {
        return data3;
    }

    public Encap(int data1, String data2, float data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }
}
