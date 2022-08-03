package com.array;

public class Array {
    public static void main(String[] args) {
        int arr2[]={1,2,3,44,5,5,5};
       int []arr=new int[5];
        arr[3]=4;
        System.out.println(arr[3]);

        System.out.println(arr2[3]);

        for(int value :arr2){
            System.out.println(value);
        }
}
}