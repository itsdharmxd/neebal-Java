package com.lamda;

/**
 * For Convenience use
 *
 * We Need FunctionalInterface to use lambda expression
 */


/**
 * Functional interface have "only one method" and we CAN INITIALIZE FUNCTIONAL INTERFACE
 */
interface Lam{
    void demo();
}




public class Example {

    public static void main(String[] args) {
         Lam lam=()->{
             System.out.println("Lambda");
         };
         lam.demo();

    }

}
