package com.gzl.thread1;

import java.io.File;

public class Thread1 extends Thread{

    @Override
    public void run() {
        try {
            super.run();
            for(int i=0; i<500000; i++) {
                if(this.interrupted()) {
                    System.out.println("停止状态，退出");
                    throw new InterruptedException();
                }
                System.out.println("i=" + i);

            }
            System.out.printf("我被输出");
        } catch (Exception e) {
            System.out.println("线程被interrupt");
            e.printStackTrace();
        }
    }
}
