package com.multithreading;

import static java.lang.Thread.sleep;

/**
 * Anonymous thread
 */
public class AnonymousThread {
    public static void main(String[] args) {

       new Thread(new Runnable() {
           @Override
           public void run() {
               try {

                   sleep(1000);
               }catch (InterruptedException e){
                   e.printStackTrace();
               }
               System.out.println("anonymus thread");
           }
       }).start();
        System.out.println("main class");
    }
}
