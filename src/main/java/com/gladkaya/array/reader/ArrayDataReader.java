package com.gladkaya.array.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ArrayDataReader {
    public ArrayDataReader() throws FileNotFoundException {
        File file = new File("D:\\epam\\array\\src\\main\\resources\\file\\ArrayDataFile.txt");
    /* BufferedReader br = new BufferedReader(new FileReader(file));
     String st;

   while ((st = br.readLine()) != null)

             System.out.println(st);*/
        Scanner scanner = new Scanner (file);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }


}

