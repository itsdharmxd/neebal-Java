package com.filehandling;

import java.util.ArrayList;
import java.util.List;

public class Serialise {

    public static void main(String[] args) {
        List<Integer>list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        for(Integer value:list){
            System.out.println(value);
        }

    }


}
