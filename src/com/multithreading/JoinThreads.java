package com.multithreading;

public class JoinThreads {

    public  int data=0;

    public static void main(String[] args){
        JoinThreads joinThreads=new JoinThreads();

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                  joinThreads.data++;
                }
            }
        });
       thread1.start();

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread1.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                for(int i=0;i<1000;i++){
                    joinThreads.data++;
                }
            }
        });
        thread2.start();
        /**
         *  Join function join the calling and called thread
         *  first called  thread will execute and after that current thread will execute
         *  here thread1 will be executed first and after that main thread  will be  joined
         */
         try{
//             thread2.join(2000);       only wait for 2 second  to execute thread1 ,after that this join will not make any impact
             thread2.join();
         }catch (InterruptedException e){
             e.printStackTrace();
         }
        System.out.println("Data ="+joinThreads.data);

    }


}
