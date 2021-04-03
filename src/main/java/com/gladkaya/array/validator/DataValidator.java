package com.gladkaya.array.validator;

import com.gladkaya.array.service.impl.ServiceArrayImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator {
    private final static Logger logger = LogManager.getLogger(DataValidator.class);
    private final static String regex = "^([-])?\\d+(\\s(([-])?\\d+))*$";

    public boolean isFileExist(String fileName) {
        File file = new File(fileName);
        logger.log(Level.INFO, fileName + " is exist? " + file.exists());
        return file.exists();
    }

    public boolean isFileEmpty(File file) {
        logger.log(Level.INFO, file + " is empty? " + (file.length() == 0));
        return file.length() == 0;
    }

    public boolean isDataValid(String line) {
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(line);
        logger.log(Level.INFO, " Line: " + matcher.matches());
        return matcher.matches();
    }
}
