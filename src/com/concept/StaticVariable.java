package com.concept;

public class StaticVariable {

    public static void main(String[] args) {

        Dummy obj1=new Dummy();
        Dummy obj2=new Dummy();
        Dummy.data=45;

        System.out.println(obj1.getData());
        System.out.println(obj2.getData());
        System.out.println(Dummy.data);
    //    Dummy.data=323; // will set all data
         obj1.setData(323);
        System.out.println(obj1.getData());
        System.out.println(obj2.getData());
        System.out.println(Dummy.data);


    }

}
class Dummy{
    public  int getData() {
        return data;
    }

    public  void setData(int dat) {
       data = dat;
    }

    static  int data;



}
