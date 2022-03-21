package com.harman.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Readvowel {
    public static void main(String[] args) {

        try {
            FileInputStream file=new FileInputStream("data.txt");
            int i=0,counta=0,counte=0,counti=0,counto=0,countu=0;
            while((i= file.read()) != -1){
                if(i=='A'){
                    counta = counta + 1;
                }
                if(i=='E'){
                    counte = counte + 1;
                }
                if(i=='I'){
                    counti = counti + 1;
                }
                if(i=='O'){
                    counto = counto + 1;
                }
                if(i=='U'){
                    countu = countu + 1;
                }
                System.out.print((char)i);

            }

            System.out.println("");
            System.out.print("Count of A: ");
            System.out.println(counta);
            System.out.print("Count of E: ");
            System.out.println(counte);
            System.out.print("Count of I: ");
            System.out.println(counti);
            System.out.print("Count of O: ");
            System.out.println(counto);
            System.out.print("Count of U: ");
            System.out.println(countu);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
