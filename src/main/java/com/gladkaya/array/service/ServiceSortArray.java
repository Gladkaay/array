package com.gladkaya.array.service;

import com.gladkaya.array.entity.EntityArray;

public interface ServiceSortArray {
    EntityArray bubbleSort(EntityArray array);
    EntityArray selectionSort(EntityArray array);
    EntityArray insertionSort(EntityArray array);
}
