package com.gladkaya.array.service;

import com.gladkaya.array.entity.EntityArray;
import com.gladkaya.array.exception.ArrayException;

public interface ServiceArray {
    int findMinElement (EntityArray arr) throws ArrayException;
    int findMaxElement (EntityArray arr);
    int findSumElements (EntityArray arr);
    double findAverageValue (EntityArray arr);
    int findCountPositiveElements (EntityArray arr);
    EntityArray changeNegativesElementsToZero(EntityArray arr);
}
