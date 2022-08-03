package com.filehandling;

import java.io.*;

/**
 *  try(resource) block  so that we don't get a headache of closing the resources
 */
public class TryWithResources {

    public static void main(String[] args) throws IOException {
        File file=new File("Dharmesh.txt");
        file.createNewFile();

        try(BufferedWriter br=new BufferedWriter(new FileWriter(file));
            BufferedReader brr=new BufferedReader(new FileReader(file))) {

            br.append("Dharmesh");
            br.append("Dharmesh");
            br.append("Dharmesh");
            br.append("Dharmesh");
            br.append("Dharmesh");
            br.append("Dharmesh");
            System.out.println("Completed");
           br.close();
            String line;
            while ((line=brr.readLine())!=null){
                System.out.println(line);
            }



        }catch (Exception e){
            System.out.println("Could not write");
        }

    }

}
