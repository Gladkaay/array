package com.gladkaya.array.validator;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

public class DataValidator {
    private final static Logger logger = LogManager.getLogger();
    private final static String REGEXP = "^(-?\\d+,?\\s?)+$";

    public boolean isFileEmpty(File file) {
        logger.log(Level.INFO, file + " is empty? " + (file.length() == 0));
        return file.length() == 0;
    }

    public boolean isDataValid(String stringNumbers) {
        logger.log(Level.INFO, "Correct string [" + stringNumbers + "]? " + stringNumbers.matches(REGEXP));
        return stringNumbers.matches(REGEXP);
    }
}
