package com.concept.abstractclass;

abstract public class Abstract {
   int data;
   void pmethod(){

   };
    abstract  void eat();

}

class Child extends Abstract {


    @Override
    void eat() {
        System.out.println("Eat Child pasta");
    }
}
class Main{
    public static void main(String[] args) {
        Abstract child=new Child();
        child.eat();
        System.out.println(child.data);
    }
}
