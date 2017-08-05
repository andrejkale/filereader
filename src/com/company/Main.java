package com.company;

import java.io.*;
import java.net.URL;
import java.util.Date;
import java.util.Random;
import java.util.RandomAccess;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {

    public static void readFullyByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print( oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }




    public static void main(String[] args) throws IOException {
       // InputStream inFile = new FileInputStream("test.txt");
       // readFullyByByte(inFile);
        System.out.println("\n\n\n");
       // InputStream inUrl = new URL("http://google.com").openStream();
       // readFullyByByte(inUrl);

        InputStream inArray = new ByteArrayInputStream(new byte[]{65,-2,67,68,-69});
        readFullyByByte(inArray);


    }



    }

