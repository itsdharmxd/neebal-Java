package com.practice;







public class MergeSort {


    static void mergeSort(int l ,int r,int []arr){

        if(l>=r)return;

        int mid=(l+r)/2;

        mergeSort(l,mid,arr);
        mergeSort(mid+1,r,arr);

        int temp[]=new int[(r-l)+1];

        int i=l,j=mid+1,k=0;

        while ((i<=mid)&&(j<=r)){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }else {
                temp[k]=arr[j];
                j++;

            }
  k++;
        }
        while (i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while (j<=r){
            temp[k]=arr[j];
            j++;
            k++;
        }
       k=0;
        for(int m=l;m<=r;k++,m++){
            arr[m]=temp[k];
        }
    }



    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,5,0,5,1,8,3};

         mergeSort(0,arr.length-1,arr);
         for(int value:arr){
             System.out.println(value);
         }

    }
}
