package com.multithreading;


import static java.lang.Thread.sleep;

public class ThreadUsingRunnable {
     public static void main(String[] args) {

         /**
          * this way we create thread using Runable
          */
         Thread counter1=new Thread(  new MyCounter3(1));
         Thread counter2=new Thread( new MyCounter3(2));


         /**
          *  run start() method and run() will be called by JVM
          */
         //  thread
         counter1.start();;
         System.out.println("''''''''''''''''''''''''''''''''");
         counter2.start();
    }
}


class MyCounter3 implements Runnable{
    private  int threadNo;

    public MyCounter3(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        countMe();
    }

    public void countMe(){
        for(int i=1;i<=9;i++){
            try {
                sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("i=="+i+" thread "+threadNo);
        }
    }


}