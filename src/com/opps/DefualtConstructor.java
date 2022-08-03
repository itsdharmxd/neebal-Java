package com.opps;

/**
 * if any constructor declared , compiler will not make default constructor
 * if no  constructor declared , default constructor will be made
 *
 * JAVA don't have default copy constructor
 *
 */

public class DefualtConstructor {

    public static void main(String[] args) {
//     A aa=new A();
       A aa=new A(33);
//       A bb= new A(aa);  JAVA dont support Default Copy Constructor
        System.out.println(aa.data);
    }



}

class A{
    int data;
    // parameter constructor
    A(int number){
        data=number;
    }
//    simple constructor
    A(){
        data=10;
    }



}