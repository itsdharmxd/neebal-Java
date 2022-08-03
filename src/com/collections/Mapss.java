package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *   Map and TreeMap
 */

public class Mapss {

    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"ADD");
        map.put(2,"SUB");
        map.put(3,"MUL");
        map.put(4,"DIV");
        map.put(5,"MOD");

       for(Map.Entry<Integer,String >entry:map.entrySet()){
           System.out.println(entry.getValue());
       }

        System.out.println("'''''''''''''''''");
        /**
         * Using Iterator
         */
        Iterator<Map.Entry<Integer,String>> entry=map.entrySet().iterator();

        while (entry.hasNext()){
            Map.Entry<Integer,String >temp=entry.next();
            System.out.println("Key = "+temp.getKey()+"  Value = "+temp.getValue());
        }



    }
}

class Tree{

    public static void main(String[] args) {
        Map<Integer,String >map =new TreeMap<Integer,String >();
        map.put(2,"SUB");
        map.put(3,"MUL");
        map.put(1,"ADD");
        map.put(4,"DIV");
        map.put(5,"MOD");
        for(Map.Entry<Integer,String >entry:map.entrySet()){
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }
    }

}
