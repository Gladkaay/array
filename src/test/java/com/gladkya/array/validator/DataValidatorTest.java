package com.gladkya.array.validator;

import com.gladkaya.array.validator.DataValidator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataValidatorTest {
    @Test
    public void isDataValidTest() {
        String stringNumbers = "a, 2, 3, 4";
        DataValidator dataValidator = new DataValidator();
        boolean validString = dataValidator.isDataValid(stringNumbers);
        Assert.assertFalse(validString);
    }
}
