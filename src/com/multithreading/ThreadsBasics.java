package com.multithreading;

/**
 * When there is a ideal time other thread will use  it
 */




/**
 *
 *  Non thread class
 */
class MyCounter{
    private  int threadNo;

    public MyCounter(int threadNo) {
        this.threadNo = threadNo;
    }

    public void countMe(){
          for(int i=1;i<=9;i++){
              System.out.println("i=="+i+" thread "+threadNo);
          }
    }


}

/**
 * Main class
 */
public class ThreadsBasics {
    public static void main(String[] args) {
        MyCounter2 counter1=new MyCounter2(1);
        MyCounter2 counter2=new MyCounter2(2);


        /**
         *  run start() method and run() will be called by JVM
          */
        //  thread
        counter1.start();;
        System.out.println("''''''''''''''''''''''''''''''''");
        counter2.start();


    }

}

/**
 * Thread class
 */
class MyCounter2 extends Thread{
    private  int threadNo;

    public MyCounter2(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        super.run();
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
