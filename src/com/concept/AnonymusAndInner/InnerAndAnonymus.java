package com.concept.AnonymusAndInner;

public class InnerAndAnonymus {

    public static void main(String[] args) {
        /**
         * Local Class
         */
        System.out.println( eE.get());

        /**
         * Anonymous Object
         * new "ClassName"().data    <= object with no name
         */



    }

}
class eE{

    static String  get (){
         class Local{
            String read(){
                return "Reading";
            }
        }
        return new Local().read();
    }

}

