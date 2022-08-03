package com.neebal;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        long ll=12332L;
        byte bm=127; // 8 bits
        float ff=10;
        double dd=23.123d;
        char d='s';
        // For High precision
        BigDecimal bd=new BigDecimal(1.05);
        BigDecimal bd2=new BigDecimal(2.55);
        System.out.println(bd.add(bd2));

        // For correcting acccuracy  (rounding up will be disabled)
        bd=new BigDecimal("1.05");
        bd2=new BigDecimal("2.55");




        String str="Strr";
        int i=45;
        System.out.println(45+45+str);  //  90str         <= output
        System.out.println(str+45+45);  //  Strr4545      <= output

     // implecite typecasting   widening data   done by java
        short s=23;
        int sd=s;       // done by  java


     // explecite typecasting    narrowing data  done by us beacuse
                                                    // there is a data loss viceversa not possible
        double ss=34.543;
        int sdd=(int)ss;  // done by programmer

        float f=4;
        switch ((int)f) // cannot use float hear
        {

        }



        System.out.println(bd.add(bd2));
        System.out.println(ll);
        System.out.println(bm);
        System.out.println(ff);
        System.out.println(dd);
        System.out.println(d);
    }
}