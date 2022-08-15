package com.practice;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};

        int l=0,r=8,element=9;

        while (l<r){
          int mid=(l+r)/2;

          if(arr[mid]>element){
              r=mid-1;
          }else if(arr[mid]<element){
              l=mid+1;
          }else break;

        }

        System.out.println(l);


    }
}
