package com.multithreading;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Producer-consumer  2 threads work simultaneously
 *
 * ArrayBlockingQueue class is a bounded blocking queue backed by an array.
 * By bounded, it means that the size of the Queue is fixed. Once created, the capacity cannot be changed.
 * Attempts to put an element into a full queue will result in the operation blocking.
 *
 */

public class BlockingQueueExample {
    static public int data=0;

    public static void main(String[] args) {
        /**
         * with capacity 10
         */
        ArrayBlockingQueue<Integer> arrayBlockingQueue=new ArrayBlockingQueue<>(10);
        Producer producer=new Producer(arrayBlockingQueue);
        Consumer consumer =new Consumer(arrayBlockingQueue);

        producer.start();
        consumer.start();
    }

}
class Producer extends Thread{

    ArrayBlockingQueue<Integer> arrayBlockingQueue;
    Producer(ArrayBlockingQueue arrayBlockingQueue){
        this.arrayBlockingQueue=arrayBlockingQueue;
    }

    @Override
    public void run() {
        super.run();

        while (true){

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Put "+BlockingQueueExample.data);
            try {
                arrayBlockingQueue.put(BlockingQueueExample.data++);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }

    }
}
class Consumer extends Thread{


    ArrayBlockingQueue<Integer> arrayBlockingQueue;
    Consumer(ArrayBlockingQueue arrayBlockingQueue){
        this.arrayBlockingQueue=arrayBlockingQueue;
    }

    @Override
    public void run() {
        super.run();

        while (true){

            try {
                sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                System.out.println("get "+arrayBlockingQueue.take());
                BlockingQueueExample.data--;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }

    }
}