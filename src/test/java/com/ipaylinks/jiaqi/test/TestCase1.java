package com.ipaylinks.jiaqi.test;

import com.ipaylinks.jiaqi.TestParent;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 extends TestParent {

    @Test
    public void testCC(){
        Assert.assertTrue(true);
        System.out.println("testCC  complete ");

        Thread thread = Thread.currentThread();
        System.out.println("testCC currentThread id is: "+thread.getId());
    }

    @BeforeMethod
    public void beforeMethod() {
        long id = Thread.currentThread().getId();
        System.out.println("Before test-method. Thread id is: " + id);
    }

    @AfterMethod
    public void afterMethod() {
        long id = Thread.currentThread().getId();
        System.out.println("After test-method. Thread id is: " + id);
    }
}
