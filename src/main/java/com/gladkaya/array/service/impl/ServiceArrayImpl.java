package com.gladkaya.array.service.impl;

import com.gladkaya.array.entity.EntityArray;
import com.gladkaya.array.exception.ArrayException;
import com.gladkaya.array.service.ServiceArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServiceArrayImpl implements ServiceArray {
    private final static Logger logger = LogManager.getLogger(ServiceArrayImpl.class);
    @Override
    public int findMinElement(EntityArray arr) throws ArrayException {
        int[] array = arr.getArray();
        if (array==null || array.length==0) {
            throw new ArrayException("Empty array");
        }

        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        logger.log(Level.DEBUG, min);
        return min;
    }

    @Override
    public int findMaxElement(EntityArray arr) throws ArrayException {
        int[] array = arr.getArray();
        if (array==null || array.length==0) {
            throw new ArrayException("Empty array");
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        logger.log(Level.DEBUG, max);
        return max;
    }

    @Override
    public int findSumElements(EntityArray arr) throws ArrayException {
        int[] array = arr.getArray();
        if (array==null || array.length==0) {
            throw new ArrayException("Empty array");
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        logger.log(Level.DEBUG, sum);
        return sum;
    }

    @Override
    public double findAverageValue(EntityArray arr) throws ArrayException {
        int[] array = arr.getArray();
        if (array==null || array.length==0) {
            throw new ArrayException("Empty array");
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        logger.log(Level.DEBUG, (double)sum / array.length);
        return (double)sum / array.length;
    }

    @Override
    public int findCountPositiveElements(EntityArray arr) throws ArrayException {
        int[] array = arr.getArray();
        if (array==null || array.length==0) {
            throw new ArrayException("Empty array");
        }
        int count = 0;
        for (int num : array) {
            if (num > 0) {
                count++;
            }
        }
        logger.log(Level.DEBUG, count);
        return count;
    }

    @Override
    public EntityArray changeNegativesElementsToZero(EntityArray arr) throws ArrayException {
        int[] array = arr.getArray();
        if (array==null || array.length==0) {
            throw new ArrayException("Empty array");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
        logger.log(Level.DEBUG, new EntityArray(array));
        return new EntityArray(array);
    }
}
