package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Once  i consume the  stream i cannot re-use it
 *
 */

public class SampleStream {




    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer> ();
        for(int i=0 ; i<9;i++){
            list.add(i);
        }

          Stream<Integer> intStream= list.stream();

        long count= intStream.filter(n->n%2==0).map(n->n*2).count();  // Multiple operations  in  one  go
        System.out.println(count);


        intStream.forEach(n-> System.out.println(n));  // Cannot use  used  stream  // stops data leak


    }
}
