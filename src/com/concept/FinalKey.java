package com.concept;

/**
 *  Final Key Word Variable
 *  cannot reassign
 */
public class FinalKey {
    public static void main(String[] args) {

        /**
         *  Re-assigning of Final Variable not possible
         */
    final  int data;
    data=45;
        System.out.println(45);

    }
}

/**
 *  Final Method
 *  cannot override
 */
class AA{
    final void func(){
        System.out.println("first");
    }
}
class BB extends AA{
//    @Override
//    void func() {                               <= cannot override as it is final function
//        System.out.println("second");
//    }
}


/**
 *  Final class
 *    cannot inherit
 */
final class F_AA{
    int data;
}
//class  F_BB extends F_AA{
//
//}