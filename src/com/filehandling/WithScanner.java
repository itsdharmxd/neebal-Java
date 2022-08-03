package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WithScanner {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Dharmesh.txt"));
            while (sc.hasNext()){
                System.out.println(sc.next());
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println("File not Found");

        }
    }
}
