package com.concept.exceptionhandling;

/**
 * child Exception should be in upper side than parent
 */
public class TryCatch {

    public static void main(String[] args) {

        try {
            int k=10/0;
        }catch (RuntimeException re){
            System.out.println("Run E");
        }
//        catch (ArithmeticException e){        Arithmetic Exception is a child of RUNTIME EXCEPTION so this block
//            System.out.println("Zero Division");               will become un reachable
//        }



    }

}

/**
 *  Finally block will always run either exception occur or not
 *
 */

class Finally{
    public static void main(String[] args) {
      try{
          System.out.println(10/0);

      }catch (ArithmeticException arithmeticException){
          System.out.println("Divided By Zero");
      }finally {
          System.out.println("Finally Block");
      }
    }
}
