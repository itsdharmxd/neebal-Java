package com.multithreading;

import static java.lang.Thread.sleep;

/**
 * Synchronize for resources access
 *
 * this "Data_counter" will give new-new value if not synchronized
 * because at same time threads are reading and writing
 *
 * we can stop method and data to give access simultaneously
 */


public class SynchronizeThread {

    public static int data_counter = 0;


    /**
     * This synchronized key word will make this function
     * accessible  only with one thread at a time
     */


    /**
     *  static synchronized function
     */
//    synchronized public static void inc(){
//        data_counter++;
//    }


    /**
     * synchronized block
     */
    static void inc(){
   //     synchronized (this)           when we declair for a non static function
   //    private string lock="lock "     <= this should be declair as class variable
   //     synchronized (lock)          <= this lock string  is hiden from outside world
         synchronized (SynchronizeThread.class){
             data_counter++;
         }

    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 1000; i++)
                    inc();

                System.out.println(" thread1 Ends ");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 1000; i++)
                    inc();
                System.out.println(" thread2 Ends ");
            }
        });
        thread1.start();
        thread2.start();
        Thread.sleep(1000);
        System.out.println("main class " + data_counter);
    }
}
