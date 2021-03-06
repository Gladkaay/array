package com.gladkaya.array.service;

import com.gladkaya.array.entity.EntityArray;
import com.gladkaya.array.exception.ArrayException;

public interface ServiceArray {
    int findMinElement(EntityArray arr) throws ArrayException;

    int findMinElementStream(EntityArray arr) throws ArrayException;

    int findMaxElement(EntityArray arr) throws ArrayException;

    int findMaxElementStream(EntityArray arr) throws ArrayException;

    int findSumElements(EntityArray arr) throws ArrayException;

    int findSumElementsStream(EntityArray arr) throws ArrayException;

    double findAverageValue(EntityArray arr) throws ArrayException;

    double findAverageValueStream(EntityArray arr) throws ArrayException;

    int findCountPositiveElements(EntityArray arr) throws ArrayException;

    int findCountPositiveElementsStream(EntityArray arr) throws ArrayException;

    EntityArray changeNegativesElementsToZero(EntityArray arr) throws ArrayException;

    EntityArray changeNegativesElementsToZeroStream(EntityArray arr) throws ArrayException;
}
