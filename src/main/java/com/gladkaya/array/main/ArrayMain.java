package com.gladkaya.array.main;

import com.gladkaya.array.creator.DataCreator;
import com.gladkaya.array.entity.EntityArray;
import com.gladkaya.array.exception.ReaderException;
import com.gladkaya.array.parser.DataParser;
import com.gladkaya.array.reader.DataReader;
import com.gladkaya.array.service.ServiceSortArray;
import com.gladkaya.array.service.impl.ServiceSortArrayImpl;


public class ArrayMain {
    public final static String PATH = "src/main/resources/file/arrayDataFile.txt";

    public static void main(String[] args) throws ReaderException {
        DataReader dataReader = new DataReader();
        DataParser dataParser = new DataParser();
        DataCreator dataCreator = new DataCreator();

        String stringNumbers = dataReader.readData(PATH);
        int[] correctString = dataParser.parseString(stringNumbers);
        EntityArray entityArray = dataCreator.createEntityArray(correctString);
        ServiceSortArray service = new ServiceSortArrayImpl();
        EntityArray sortArray = service.bubbleSort(entityArray);
    }
}
