package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);

      displayList(arr);
//        System.out.println( arr.lastIndexOf(11));

    }
    static  void displayList(List<Integer>list){
        for (Integer value :list){
            System.out.println(value);
        }
    }

}
