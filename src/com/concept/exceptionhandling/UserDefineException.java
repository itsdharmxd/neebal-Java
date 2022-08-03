package com.concept.exceptionhandling;

/**
 * User Define Exception
 *  We can use both Exception class and Throwable Class
 */

class NegativeBaseException extends Exception{
    NegativeBaseException(){
        super("Base  is Negative");
    }
}


public class UserDefineException {

    public static void main(String[] args) {

        try {
            int divider=-1;
               if(divider<1)throw new NegativeBaseException();
            int data=10/divider;
            System.out.println(data);
        }catch (NegativeBaseException nbe){
            System.out.println( nbe.getMessage());
        }

    }

}
