package com.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Wild Card character "?"  is used if we dont know the  type
 */
public class WildCardGenerics {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
       display(list);

    }
    static  void display (List<?>list){
        for (Object value:list){
            System.out.println(value);
        }
    }
}
