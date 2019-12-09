package com.gzl.thread2;

/**
 * @author guzl
 * @description
 * @date 2019/12/9
 */
public class Demo {
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        new java.lang.Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    class1.method2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new java.lang.Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    class2.method1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
