package com.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * This is how wrapper classes work
 */
public class AutoBoxingAndUnBoxing {
    public static void main(String[] args) {

        List<IntegerWrapper> integerWrappers=new ArrayList<>();
        integerWrappers.add(new IntegerWrapper(23));  // Auto Boxing
        System.out.println(integerWrappers.get(0).value);  // Unboxing

    }
}

class IntegerWrapper {
    int value;

    public IntegerWrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
