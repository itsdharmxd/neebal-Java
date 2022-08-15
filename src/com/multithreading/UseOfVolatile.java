package com.multithreading;

import static java.lang.Thread.sleep;

/**
 * (this a rare occurange) we recoment volatile keyword
 * Much time java will cache the depending variable and we could not read the updated value
 * this may lead to infinite loop
 */


public class UseOfVolatile {
    /**
     * so that defined scenario don't occur
     * volatile keyword is recomented
     */

    //Dependent variable
   volatile public static boolean flag=true;

   public static void main(String[] args) {

       new Thread(new Runnable() {
           @Override
           public void run() {
               while (true){

                  if(flag){
                      System.out.println("Runnable");
                  }else {
                      break;
                  }

               }
           }
       }).start();

       new Thread(new Runnable() {
           @Override
           public void run() {

               try {
                   sleep(1000);
               }catch (InterruptedException e){
                   e.printStackTrace();
               }

               flag=false;
               System.out.println("flag updated");


           }
       }).start();



    }

}
