package com.ipaylinks.jiaqi;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {


    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.ipaylinks.jiaqi.TestClass1");
            Object o = aClass.newInstance();
            System.out.println("o ==> "+o.toString());
            Object o1 = aClass.newInstance();
            System.out.println("o1 ==> "+o1.toString());
            Object o2 = aClass.newInstance();
            System.out.println("o2 ==> "+o2.toString());
            Class<?> aClass2 = Class.forName("com.ipaylinks.jiaqi.TestClass2");
            Object o3 = aClass2.newInstance();
            System.out.println("o3 ==> "+o3.toString());
            Object o4 = aClass2.newInstance();
            System.out.println("o4 ==> "+o4.toString());
            Constructor<?> constructor = aClass2.getConstructor(new Class[]{int.class});
            Object o5 = constructor.newInstance(new Object[]{1233});
            System.out.println("o5 ==> "+o5.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
