package com.opps;

public class Polymorphism {
    public static void main(String[] args) {
    Phone nokia3310=new Nokia3310();

        /**
         * calling "Parent feature" as child not define
         */
    System.out.println(nokia3310.feature());

        /**
         * calling "child feature" as child has define
         */

    Phone samsung= new SamsungS8();
        System.out.println(samsung.feature());
//        System.out.println(samsung.feature2()); // not possible
        System.out.println(samsung.feature3());

    }



}

class Phone {
  //  String feature;
    String feature (){
    String   feature="Phone Feature";

        return feature;
    }
    String feature3 (){
        String   feature="Phone Feature3";

        return feature;
    }

}
class SamsungS8 extends Phone {

    String feature(){
        return "Samsung Feature";
    }
    String feature2(){
        return "Samsung Feature2";
    }


}
class Iphone extends Phone{

    String feature(){
        return "Iphone Feature";
    }


}
class Nokia3310 extends Phone{

}

