package com.gladkaya.array.service.impl;


import com.gladkaya.array.entity.EntityArray;
import com.gladkaya.array.exception.ArrayException;
import com.gladkaya.array.service.ServiceArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ServiceArrayImplTest {
    EntityArray array = new EntityArray(1, 3, -2, 5);
    @Test
    void findMinElementTest () throws ArrayException {

        ServiceArray service = new ServiceArrayImpl();
        Assert.assertEquals(service.findMinElement(array),-2);

       /* try {
            Assert.assertEquals(service.findMinElement(array),1);
        } catch (ArrayException e) {
           Assert.assertFalse(false);
        }*/
    }

    @Test
    void findMaxElementTest() throws ArrayException {
        ServiceArray service = new ServiceArrayImpl();
        Assert.assertEquals(service.findMaxElement(array),5);
    }

    @Test
    public void findSumElementsTest() {
        ServiceArray service = new ServiceArrayImpl();
        Assert.assertEquals(service.findSumElements(array),7);
    }

    @Test
    public void findAverageValueTest() {
        ServiceArray service = new ServiceArrayImpl();
        Assert.assertEquals(service.findAverageValue(array),1.75);
    }

    @Test
    public void findCountPositiveElementsTest() {
        ServiceArray service = new ServiceArrayImpl();
        Assert.assertEquals(service.findCountPositiveElements(array),3);
    }

    @Test
    public void changeNegativesElementsToZeroTest() {
        ServiceArray service = new ServiceArrayImpl();
        Assert.assertEquals(service.changeNegativesElementsToZero(array),new EntityArray(1, 3, 0, 5));
    }
}