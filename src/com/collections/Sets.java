package com.collections;

import java.util.*;

/**
 * HashSet , TreeSet, LinkedHashSet
 */
public class Sets {

    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(2);

        set.add(13);
        set.add(1);
        for(Integer value :set){
            System.out.println(value);
        }
        List<Integer> list=new ArrayList<>();
        list.addAll(set);

        /**
         * Binary Search
         */
        System.out.println(Collections.binarySearch(list,4));

    }
}
