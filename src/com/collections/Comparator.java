package com.collections;

import javax.xml.crypto.Data;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Dharmesh implements Comparable<Dharmesh>{
    int data;

    @Override
    public String toString() {
        return "Dharmesh{" +
                "data=" + data +
                '}';
    }

    public Dharmesh(int data) {
        this.data = data;
    }

    @Override
    public int compareTo(Dharmesh o) {
        if(data==o.data){
            return 0;
        }else if(data>o.data){
            return 1;

        }else return -1;
    }
}

public class Comparator {

    public static void main(String[] args) {



        Set<Dharmesh> set=new TreeSet<Dharmesh>();

        set.add(new Dharmesh(1));
        set.add(new Dharmesh(2));
        set.add(new Dharmesh(3));
        set.add(new Dharmesh(4));
        set.add(new Dharmesh(4));
        System.out.println(set.toString());
    }
}
