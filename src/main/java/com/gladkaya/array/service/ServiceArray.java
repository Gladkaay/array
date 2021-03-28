package com.gladkaya.array.service;

import com.gladkaya.array.entity.EntityArray;

public interface ServiceArray {
    int findMinElement (EntityArray array);
    int findMaxElement (EntityArray array);
    int findSumElements (EntityArray array);
    double findAverageValue (EntityArray array);
    int findCountPositiveElements (EntityArray array);
    EntityArray changeNegativesElementsToZero(EntityArray array);
}
