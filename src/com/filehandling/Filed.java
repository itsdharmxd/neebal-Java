package com.filehandling;

import java.io.File;
import java.io.IOException;

/**
 * Creating file
 */
public class Filed {
    public static void main(String[] args) throws IOException {

      File file =new File("src\\com\\filehandling\\Dharmesh.txt");
      file.createNewFile();
        System.out.println("File created");

    }
}


/**
 *Creating folder
 */

class Dir{
    public static void main(String[] args) {
        File dir=new File("src\\com\\filehandling\\directory");
       dir.mkdir();
        System.out.println("Directory created");
    }


}
