package com.concept.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Throw
 */
public class ThrowAndThrows {

    public static void main(String[] args) {

        try{
            int d=-1;
            if(d<1){
                throw new ArithmeticException();
            }
            int data=10/d;
            System.out.println(data);

        }catch (ArithmeticException ar){
            System.out.println("negative divider");
        }

    }

}

/**
 * Throws (by method)
 */

class ThrowsException{


    public static void main(String[] args) {
        try {
            int answer = divider(10, 0);
        }catch (ArithmeticException ae){
            System.out.println("Denominator is 0");
        }
    }

    static int divider(int a, int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        return  a/b;
    }


}
