package com.gladkaya.array.service.impl;


import com.gladkaya.array.entity.EntityArray;
import com.gladkaya.array.exception.ArrayException;
import com.gladkaya.array.service.ServiceArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ServiceArrayImplTest {
    private final static EntityArray array = new EntityArray(1, 3, -2, 5);

    @Test
    void findMinElementTest() throws ArrayException {
        ServiceArray service = new ServiceArrayImpl();
        int min = service.findMinElement(array);
        Assert.assertEquals(min, -2);
    }

    @Test
    public void findMinElementTestStreamTest() throws ArrayException {
        ServiceArray service = new ServiceArrayImpl();
        int min = service.findMinElementStream(array);
        Assert.assertEquals(min, -2);
    }

    @Test
    void findMaxElementTest() throws ArrayException {
        ServiceArray service = new ServiceArrayImpl();
        int max = service.findMaxElement(array);
        Assert.assertEquals(max, 5);
    }

    @Test
    public void findMaxElementStreamTest() throws ArrayException {
        ServiceArray service = new ServiceArrayImpl();
        int max = service.findMaxElementStream(array);
        Assert.assertEquals(max, 5);
    }

    @Test
    public void findSumElementsTest() throws ArrayException {
        ServiceArray service = new ServiceArrayImpl();
        int sum = service.findSumElements(array);
        Assert.assertEquals(sum, 7);
    }

    @Test
    public void findSumElementsStreamTest() throws ArrayException {
        ServiceArray service = new ServiceArrayImpl();
        int sum = service.findSumElementsStream(array);
        Assert.assertEquals(sum, 7);
    }

    @Test
    public void findAverageValueTest() throws ArrayException {
        ServiceArray service = new ServiceArrayImpl();
        double average = service.findAverageValue(array);
        Assert.assertEquals(average, 1.75);
    }

    @Test
    public void findAverageValueStreamTest() throws ArrayException {
        ServiceArray service = new ServiceArrayImpl();
        double average = service.findAverageValueStream(array);
        Assert.assertEquals(average, 1.75);
    }

    @Test
    public void findCountPositiveElementsTest() throws ArrayException {
        ServiceArray service = new ServiceArrayImpl();
        int count = service.findCountPositiveElements(array);
        Assert.assertEquals(count, 3);
    }

    @Test
    public void findCountPositiveElementsStreamTest() throws ArrayException {
        ServiceArray service = new ServiceArrayImpl();
        int count = service.findCountPositiveElementsStream(array);
        Assert.assertEquals(count, 3);
    }

    @Test
    public void changeNegativesElementsToZeroTest() throws ArrayException {
        ServiceArray service = new ServiceArrayImpl();
        EntityArray changeNegatives = service.changeNegativesElementsToZero(array);
        EntityArray changeNegativesExpected = new EntityArray(1, 3, 0, 5);
        Assert.assertEquals(changeNegatives, changeNegativesExpected);
    }

    @Test
    public void changeNegativesElementsToZeroStreamTest() throws ArrayException {
        ServiceArray service = new ServiceArrayImpl();
        EntityArray changeNegatives = service.changeNegativesElementsToZeroStream(array);
        EntityArray changeNegativesExpected = new EntityArray(1, 3, 0, 5);
        Assert.assertEquals(changeNegatives, changeNegativesExpected);
    }
}