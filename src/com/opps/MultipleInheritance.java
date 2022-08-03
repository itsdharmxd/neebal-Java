package com.opps;

public class MultipleInheritance {

    public static void main(String[] args) {


    }

};

class Parent1 {
    int legs;

};

class Parent2 {
    int legs;

};

/**
 * Cannot have multiple inheritance
 * to save g from ambiguity
 */
//class Child extends Parent1,Parent2 {
//    String cuteness;
//}

class  Child extends Parent1{
    String cuteness;
}


