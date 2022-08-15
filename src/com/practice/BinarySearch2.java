package com.practice;

public class BinarySearch2 {

    public static void main(String[] args) {

        int arr[]=new int[6];
        for(int i=0;i<6;i++){
            arr[i]=i+1;
        }

        int l=0,r=5;
        int element=5;

        while(l<r){
         int mid=(l+r)/2;

          if(element==arr[mid]){
              System.out.println(mid);
              break;
          }else if(element<arr[mid]){
              r=mid-1;
          }else {
              l=mid+1;
          }


        }
    }


}
