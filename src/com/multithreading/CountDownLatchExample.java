package com.multithreading;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch class is a synchronization aid which allows one or more
 * thread to wait (by making lock) until the mandatory operations are performed by other threads.
 * CountDownLatch
 * is initialized with a given count of threads which are required to be completed before the main thread
 */
class SomeThreadLatch extends Thread{
    CountDownLatch latch;
    SomeThreadLatch(CountDownLatch latch){
        this.latch=latch;
    }

    @Override
    public void run() {
        super.run();

        try {
            sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread runs "+Thread.currentThread().getName());

        /**
         * will unlock one latch
          */
    latch.countDown();
    }
}


public class CountDownLatchExample {

    public static void main(String[] args) {
        /**
         * Now this latch have 4  lock, and after we unlock 4 locks then only  .await() method will release
         */
        CountDownLatch latch =new CountDownLatch(4);

        SomeThreadLatch thread1=new SomeThreadLatch(latch);
        SomeThreadLatch thread2=new SomeThreadLatch(latch);
        SomeThreadLatch thread3=new SomeThreadLatch(latch);
        SomeThreadLatch thread4=new SomeThreadLatch(latch);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            /**
             * Only runs when all locks are unlocked
             */
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main method executed");

    }


}
