package com.generics;

import java.util.List;

/**
 * "extents" is used to restrict Type in Generics
 * like "<E extents Number>"   NUmber class and its child only can be use
 *
 *    "extends" for Upper Bound
 *    "super"   for Lower Bound
 */
public class BoundingGenerics {


    public static <E extends Number>  void display(List<E> list){
        for(E value :list){
            System.out.println(value);
        }
    }

    public static void main(String[] args) {

    }
}
