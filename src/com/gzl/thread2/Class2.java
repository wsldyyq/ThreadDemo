package com.gzl.thread2;

/**
 * @author guzl
 * @description
 * @date 2019/12/9
 */
public class Class2 {
    public static Object object = new Object();

    public void method1() throws InterruptedException {
        int i = 0;
        synchronized (object) {
            while (i < 1000) {
                java.lang.Thread.sleep(100);
                System.out.println("111111111");
                i++;
            }
        }
    }
}
