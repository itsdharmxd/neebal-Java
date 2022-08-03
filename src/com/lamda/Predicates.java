package com.lamda;

import java.util.function.IntPredicate;

/**
 * For more Readable code
 * Interfaces with one function .test()  <= to test values
 */
public class Predicates {
    public static void main(String[] args) {

        IntPredicate isLessThan20=new IntPredicate() {
            @Override
            public boolean test(int value) {
               return value<20;
            }
        };


        IntPredicate isGreaterThan10=i->i>10;

        System.out.println(isGreaterThan10.and(isLessThan20).test(15));


    }

}
