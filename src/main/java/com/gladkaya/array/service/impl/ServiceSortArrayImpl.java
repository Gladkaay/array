package com.gladkaya.array.service.impl;


import com.gladkaya.array.entity.EntityArray;
import com.gladkaya.array.service.ServiceSortArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServiceSortArrayImpl implements ServiceSortArray {
    private final static Logger logger = LogManager.getLogger(ServiceArrayImpl.class);
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

    //@Override
    private int partition(EntityArray arr, int begin, int end) {
        int[] array = arr.getArray();
        int pivot = end;
        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }
    public EntityArray quickSort(EntityArray arr, int begin, int end) {
        int[] array = arr.getArray();
        if (end <= begin) return arr;
        int pivot = partition(arr, begin, end);
        quickSort(arr, begin, pivot-1);
        quickSort(arr, pivot+1, end);
        logger.log(Level.DEBUG, arr);
        return arr;
    }
}

