package com.collections;

import java.util.Stack;

public class StackMethods {

    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        System.out.println(stk.peek());
    }
}
