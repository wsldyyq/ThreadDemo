package com.gzl.thread2;

/**
 * @author guzl
 * @description volatile
 * @date 2019-03-11
 */
public class Thread implements Runnable{
    private boolean isContinuePrint;

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }

    @Override
    public void run() {
        while (isContinuePrint) {
            System.out.println("print word");
        }
    }
}
