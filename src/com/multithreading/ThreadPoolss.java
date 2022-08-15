package com.multithreading;

import jdk.jshell.spi.ExecutionControl;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * thorugh which we can manage thread more easily and efficiently
 */

class SomeThread extends Thread{

    public SomeThread(String name){
        this.setName(name);
    }


    @Override
    public void run() {
        super.run();
        System.out.println("Started thread = "+this.getName());
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Ended Thread = "+this.getName());
    }
}


public class ThreadPoolss {

    public static void main(String[] args) {
        /**
         * will execute at max three thread  at a time
         */
        ExecutorService executorService= Executors.newFixedThreadPool(3);


        SomeThread thread1=new SomeThread("Thread 1");
        SomeThread thread2=new SomeThread("Thread 2");
        SomeThread thread3=new SomeThread("Thread 3");
        SomeThread thread4=new SomeThread("Thread 4");
        SomeThread thread5=new SomeThread("Thread 5");
        SomeThread thread6=new SomeThread("Thread 6");
        SomeThread thread7=new SomeThread("Thread 7");
        SomeThread thread8=new SomeThread("Thread 8");

        executorService.execute(thread1);
        executorService.execute(thread2);
        executorService.execute(thread3);
        executorService.execute(thread4);
        executorService.execute(thread5);
        executorService.execute(thread6);
        executorService.execute(thread7);
        executorService.execute(thread8);


        /**
         * this will end the program
         */
        executorService.shutdown();

    }
}
