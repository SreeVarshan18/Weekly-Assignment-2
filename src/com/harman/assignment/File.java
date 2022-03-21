package com.harman.assignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class File {
    public static void main(String[] args) {

        String str= "HAPPY NEW YEAR";

        try {
            FileOutputStream file = new FileOutputStream("data.txt");
            byte a[] = str.getBytes();
            file.write(a);
            file.close();
            System.out.println("File created Successfully!!!");


        } catch (FileNotFoundException e) {
            System.out.println(e);;
        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
