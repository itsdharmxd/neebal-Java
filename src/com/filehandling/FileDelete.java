package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDelete {
    public static void main(String[] args) {

     try {
         File file = new File("Dharmesh.txt");
         if( file.delete()){
             System.out.println("Successfully Deleted");
         }else{
             System.out.println("Unable to delete");
         }
     }catch (Exception e){
         System.out.println("FileNot Found");
     }



    }
}
