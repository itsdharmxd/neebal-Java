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

           for (Integer value :arr){
               System.out.println(value);
           }
        System.out.println( arr.lastIndexOf(11));

    }

}
