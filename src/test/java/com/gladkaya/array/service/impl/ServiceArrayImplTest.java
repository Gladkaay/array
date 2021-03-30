package com.gladkaya.array.service.impl;


import com.gladkaya.array.entity.EntityArray;
import com.gladkaya.array.exception.ArrayException;
import com.gladkaya.array.service.ServiceArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ServiceArrayImplTest {
    private final EntityArray array = new EntityArray(1, 3, -2, 5);

    @Test
    void findMinElementTest () throws ArrayException {
        ServiceArray service = new ServiceArrayImpl();
        Assert.assertEquals(service.findMinElement(array),-2);
    }

    @Test
    void findMaxElementTest() throws ArrayException {
        ServiceArray service = new ServiceArrayImpl();
        Assert.assertEquals(service.findMaxElement(array),5);
    }

    @Test
    public void findSumElementsTest() throws ArrayException {
        ServiceArray service = new ServiceArrayImpl();
        Assert.assertEquals(service.findSumElements(array),7);
    }

    @Test
    public void findAverageValueTest() throws ArrayException {
        ServiceArray service = new ServiceArrayImpl();
        Assert.assertEquals(service.findAverageValue(array),1.75);
    }

    @Test
    public void findCountPositiveElementsTest() throws ArrayException {
        ServiceArray service = new ServiceArrayImpl();
        Assert.assertEquals(service.findCountPositiveElements(array),3);
    }

    @Test
    public void changeNegativesElementsToZeroTest() throws ArrayException {
        ServiceArray service = new ServiceArrayImpl();
        Assert.assertEquals(service.changeNegativesElementsToZero(array),new EntityArray(1, 3, 0, 5));
    }
}