package com.gladkaya.array.parser;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;


public class DataParser {
    private final static Logger logger = LogManager.getLogger();
    private final static String STRING_REGEXP = ",?\\s+";

    public int[] parseString(String stringNumbers) {
        String[] stringArray = stringNumbers.split(STRING_REGEXP);
        int[] correctString = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            correctString[i] = Integer.parseInt(stringArray[i]);
        }
        logger.log(Level.INFO, "Correct string: " + Arrays.toString(correctString));
        return correctString;
    }
}
