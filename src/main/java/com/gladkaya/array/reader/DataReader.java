package com.gladkaya.array.reader;

import com.gladkaya.array.entity.EntityArray;
import com.gladkaya.array.exception.ReaderException;
import com.gladkaya.array.validator.DataValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DataReader {
    private final static Logger logger = LogManager.getLogger(DataReader.class);

    /*public DataReader() throws ReaderException {
        File file = new File("D:\\epam\\array\\src\\main\\resources\\file\\ArrayDataFile.txt");
    *//* BufferedReader br = new BufferedReader(new FileReader(file));
     String st;

   while ((st = br.readLine()) != null)

             System.out.println(st);*//*
        Scanner scanner = new Scanner (file);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }*/
    public ArrayList<String> readData(String path) throws ReaderException {
        ArrayList<String> correctLine = new ArrayList<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            correctLine.add(line);
        } catch (IOException e) {
            throw new ReaderException("File doesn't exist");
        }
        return correctLine;
        //      ArrayParser parser = new ArrayParser();
    }
}
