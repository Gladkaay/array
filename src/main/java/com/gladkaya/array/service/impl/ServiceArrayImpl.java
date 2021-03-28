package com.gladkaya.array.service.impl;

import com.gladkaya.array.entity.EntityArray;
import com.gladkaya.array.service.ServiceArray;

public class ServiceArrayImpl implements ServiceArray {
    @Override
    public int findMinElement(EntityArray arr) {
        int[] array = arr.getArray();
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    @Override
    public int findMaxElement(EntityArray arr) {
        int[] array = arr.getArray();
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    @Override
    public int findSumElements(EntityArray arr) {
        int[] array = arr.getArray();
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    @Override
    public double findAverageValue(EntityArray arr) {
        int[] array = arr.getArray();
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    @Override
    public int findCountPositiveElements(EntityArray arr) {
        int[] array = arr.getArray();
        int count = 0;
        for (int num : array) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public EntityArray changeNegativesElementsToZero(EntityArray arr) {
        int[] array = arr.getArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
        return new EntityArray(array);
    }
}
