package com.practice;

public class Loops {

    public static void main(String[] args) {

//        for(int i=1;i<=10;i++){
//            if(i%2==1)
//            System.out.println("Value of i is = "+i);
//        }

        int i=0;

        do{
            if(i==0){
                System.out.println("Value of i is = "+i);
            }else if(i%2==1){
                System.out.println("Value of i is = "+i);
            }
             i++;
        }while (i<10);


    }

}
