package com.gzl.thread1;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t = new Thread1();
        t.start();
        Thread.sleep(2000);
        t.interrupt();

        System.out.println("end!");
    }
}
