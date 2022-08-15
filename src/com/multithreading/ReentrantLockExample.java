package com.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Reentent lock help in preventing deadlock
 * by locking the thread
 */

public class ReentrantLockExample {
    static  int counter=0;
    static public Lock lock =new ReentrantLock();
    public static void main(String[] args) {

     Thread thread1=     new Thread(new Runnable() {
              @Override
              public void run() {
                  lock.lock();
                  for(int i=0;i<1000;i++)
                      ReentrantLockExample.counter++;
                  lock.unlock();
              }
          });

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                /**
                 * we should unlock otherwise our program get stuck
                 */
                lock.lock();
                for(int i=0;i<1000;i++)
                    ReentrantLockExample.counter++;
                lock.unlock();
            }
        }) ;

       thread1.start();
       thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("answer = "+ReentrantLockExample.counter );
    }

}
