package com.gladkaya.array.service;

import com.gladkaya.array.entity.EntityArray;

public interface ServiceSortArray {
    EntityArray bubbleSort(EntityArray arr);

    EntityArray selectionSort(EntityArray arr);

    EntityArray insertionSort(EntityArray arr);

    EntityArray streamSort(EntityArray arr);
}
