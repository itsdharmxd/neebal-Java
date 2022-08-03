package com.lamda;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data{


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Data(String data) {
        this.data = data;
    }

    String  data;


}



public class ComparatorLambda {
    public static void main(String[] args) {
        List<Data>list=new ArrayList<>();

        list.add(new Data("7"));
        list.add(new Data("3"));
        list.add(new Data("2"));
        list.add(new Data("8"));
        list.add(new Data("5"));


        /**
         * Comparator as Lambda
         */
        Collections.sort(list, new Comparator<Data>() {
            @Override
            public int compare(Data o1, Data o2) {
                return o1.data.compareTo(o2.data);

            }
        });
        Collections.sort(list, (Data o1,Data o2)->(o1.data==o2.data)?0:1);

        for(Data data:list) System.out.println(data.data);


    }
}
