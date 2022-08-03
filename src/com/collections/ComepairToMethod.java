package com.collections;

public class ComepairToMethod {

    public static void main(String[] args) {
        Integer a=1,b=10;
        System.out.println(a.compareTo(b));
         a=10;b=10;
        System.out.println(a.compareTo(b));
         a=10;b=1;
        System.out.println(a.compareTo(b));
    }
}

/**
 * Declaring CompareTo method for any class
 */
class Name implements Comparable<Name>{


    @Override
    public int compareTo(Name o) {

        return 0;
    }
}