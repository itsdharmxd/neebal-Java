package com.concept.strings;

/**    Both are Mutable
 * String Buffer ->  Thread safe
 * String Builder -> Not Thread Safe
 */
public class StringBufferAndStringBuilder {
    public static void main(String[] args) {
         StringBuffer stb=new StringBuffer("Dharmesh");
         stb.append(" Upadhyay");
        System.out.println(stb);
    }
}
