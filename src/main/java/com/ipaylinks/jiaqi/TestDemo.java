package com.ipaylinks.jiaqi;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @author iPayLinks
 */
public class TestDemo extends TestParent {

//    public TestDemo() {
//        System.out.println("================TestDemo================");
//    }

    @Test
    public void testcase1(){
        Assert.assertTrue(true);
        Reporter.log("ssssssssssssss");
        System.out.println("testcase1");

        Thread thread = Thread.currentThread();
        System.out.println("testcase1 currentThread id is: "+thread.getId());
    }
    @Test
    public void testcase2(){
        Assert.assertTrue(false);
        System.out.println("testcase2");

        Thread thread = Thread.currentThread();
        System.out.println("testcase2 currentThread id is: "+thread.getId());
    }


    @Test(dataProvider = "haha",threadPoolSize = 2,invocationCount = 2)
    public void testData1(String name,int age) {
        Thread thread = Thread.currentThread();
        System.out.println("currentThread id is: "+thread.getId());
        Reporter.log("---------------------- testData1 start -----------------------");
        System.out.println("name is " + name + " and age is " + age);
        Assert.assertTrue(age < 30);
        Reporter.log("---------------------- testData1 end -----------------------");
    }


    @DataProvider(name = "haha")
    public Object[][] genData(Method m){
//        String m="";
        Thread thread = Thread.currentThread();
        System.out.println("genData  currentThread id is: "+thread.getId()+"   对象"+this.toString());
        System.out.println(m.toString());
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        return new Object[][]{
                {"gaojing",28},
                {"liuyang",29},
                {"yangjiaqi",27}
        };
    }

}
