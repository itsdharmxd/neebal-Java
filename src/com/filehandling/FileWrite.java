package com.filehandling;

import java.io.*;

/**
 * Bufferwriter and Filewriter
 */
public class FileWrite {

    public static void main(String[] args) {
        File file=new File("Dharmesh.txt");
      try {
          file.createNewFile();
          System.out.println("File created");
      }catch (IOException e){
          System.out.println("File not created");
      }

      try{
          BufferedWriter bw=new BufferedWriter(new FileWriter(file));
          bw.append("Dharmesh ");
          bw.append("Dharmesh ");
          bw.append("Dharmesh ");
          bw.append("Dharmesh ");
          bw.append("Dharmesh ");
          bw.append("Dharmesh ");
          bw.close();

          System.out.println("Writing Completed");
      } catch (IOException e) {
          System.out.println("Error while writing");
      }
       try {
           BufferedReader br=new BufferedReader(new FileReader(file));
          String line;
          while ((line=br.readLine())!=null)
           System.out.println(line);

       }catch (IOException ex){
           System.out.println("Cannot read file");
       }

    }

}
