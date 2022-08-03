package com.generics;


/**
 *
 * @param <T> Type
 * @param <E> Element
 * @param <K> Key
 * @param <V> Value
 * @param <N> Number
 */
class GenericClass<T,E,K,V,N>{
   private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public GenericClass(T data) {
        this.data = data;
    }
}



public class Genericss {

    public static void main(String[] args) {
        /**
         * We can also do this But this consumes more Time
         */
        GenericClass gc=new GenericClass("Dharmesh");
        String str=(String) gc.getData();

         gc=new GenericClass(34);
        Integer strr=(Integer) gc.getData();

        /**
         * This is better use
         * type safety
         */
        GenericClass<String,String,String,String,String> genericClass=new GenericClass<String,String,String,String,String>("Dharmesh");  // only string
        String s=genericClass.getData();

    }

}
