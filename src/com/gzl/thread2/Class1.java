package com.gzl.thread2;

/**
 * @author guzl
 * @description
 * @date 2019/12/9
 */
public class Class1 {
    public void method2() throws InterruptedException {
        int i=0;
        synchronized (Class2.object) {
            while (i < 10) {
                java.lang.Thread.sleep(100);
                System.out.println("2222");
                i++;
            }
        }
    }
}
