package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {

    public static  <E> void dispaly(List<E> list){
        for(E value : list){
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
         List<String >arr=new ArrayList<String>();
         arr.add("Dharmesh");
        arr.add("Dha");
        arr.add("Dhrmesh");
        arr.add("Dhrmesh");
        dispaly(arr);
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        dispaly(list);
    }
}
