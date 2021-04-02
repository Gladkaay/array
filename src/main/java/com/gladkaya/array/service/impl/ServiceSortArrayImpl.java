package com.gladkaya.array.service.impl;


import com.gladkaya.array.entity.EntityArray;
import com.gladkaya.array.service.ServiceSortArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServiceSortArrayImpl implements ServiceSortArray {
    private final static Logger logger = LogManager.getLogger(ServiceSortArrayImpl.class);
    @Override
    public EntityArray bubbleSort(EntityArray arr) {
        int[] array = arr.getArray();
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        logger.log(Level.DEBUG, new EntityArray(array));
        return new EntityArray(array);
    }

    @Override
    public EntityArray selectionSort(EntityArray arr) {
        int[] array = arr.getArray();
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int num = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    num = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[num] = temp;
        }
        logger.log(Level.DEBUG, new EntityArray(array));
        return new EntityArray(array);
    }

    @Override
    public EntityArray insertionSort(EntityArray arr) {
        int[] array = arr.getArray();
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        logger.log(Level.DEBUG, new EntityArray(array));
        return new EntityArray(array);
    }
}

