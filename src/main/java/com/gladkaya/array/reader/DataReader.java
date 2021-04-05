package com.gladkaya.array.reader;

import com.gladkaya.array.exception.ReaderException;
import com.gladkaya.array.validator.DataValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class DataReader {
    private final static Logger logger = LogManager.getLogger();

    public String readData(String path) throws ReaderException {
        DataValidator dataValidator = new DataValidator();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String stringNumbers = null;
            while (bufferedReader.ready() && stringNumbers == null) {
                String dataString = bufferedReader.readLine();
                if (dataValidator.isDataValid(dataString)) {
                    stringNumbers = dataString;
                    logger.log(Level.INFO, "String: " + stringNumbers);
                }
            }
            if (stringNumbers == null) {
                throw new ReaderException("File doesn't contain correct strings");
            }
            return stringNumbers;
        } catch (FileNotFoundException e) {
            throw new ReaderException("File doesn't exist");
        } catch (IOException e) {
            throw new ReaderException("Input/Output exception");
        }
    }
}
