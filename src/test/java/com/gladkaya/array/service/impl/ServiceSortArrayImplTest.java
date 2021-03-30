package com.gladkaya.array.service.impl;

import com.gladkaya.array.entity.EntityArray;
import com.gladkaya.array.service.ServiceSortArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ServiceSortArrayImplTest {
    EntityArray array = new EntityArray(1, 3, -2, 5);

    @Test
    public void bubbleSortTest() {
        ServiceSortArray service = new ServiceSortArrayImpl();
        Assert.assertEquals(service.bubbleSort(array),new EntityArray(-2, 1, 3, 5));
    }

    @Test
    public void selectionSortTest() {
        ServiceSortArray service = new ServiceSortArrayImpl();
        Assert.assertEquals(service.selectionSort(array),new EntityArray(-2, 1, 3, 5));
    }

    /*@Test
    public void quickSortTest() {
        ServiceSortArray service = new ServiceSortArrayImpl();
        Assert.assertEquals(service.quickSort(arr),new EntityArray(-2, 1, 3, 5));
    }*/
}
