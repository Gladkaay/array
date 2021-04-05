package com.gladkaya.array.service.impl;

import com.gladkaya.array.entity.EntityArray;
import com.gladkaya.array.service.ServiceSortArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ServiceSortArrayImplTest {
    private final static EntityArray array = new EntityArray(1, 3, -2, 5);

    @Test
    public void bubbleSortTest() {
        ServiceSortArray service = new ServiceSortArrayImpl();
        EntityArray sortArray = service.bubbleSort(array);
        EntityArray sortArrayExpected = new EntityArray(-2, 1, 3, 5);
        Assert.assertEquals(sortArray, sortArrayExpected);
    }

    @Test
    public void selectionSortTest() {
        ServiceSortArray service = new ServiceSortArrayImpl();
        EntityArray sortArray = service.selectionSort(array);
        EntityArray sortArrayExpected = new EntityArray(-2, 1, 3, 5);
        Assert.assertEquals(sortArray, sortArrayExpected);
    }

    @Test
    public void insertionSortTest() {
        ServiceSortArray service = new ServiceSortArrayImpl();
        EntityArray sortArray = service.insertionSort(array);
        EntityArray sortArrayExpected = new EntityArray(-2, 1, 3, 5);
        Assert.assertEquals(sortArray, sortArrayExpected);
    }

    @Test
    public void streamSortTest() {
        ServiceSortArray service = new ServiceSortArrayImpl();
        EntityArray sortArray = service.streamSort(array);
        EntityArray sortArrayExpected = new EntityArray(-2, 1, 3, 5);
        Assert.assertEquals(sortArray, sortArrayExpected);
    }
}
