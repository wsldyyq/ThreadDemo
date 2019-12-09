package com.gzl.threadLocal;

/**
 * @author guzl
 * @description
 * @date 2019-06-27
 */
public class MyThreadLocal {
    private static final ThreadLocal<Object> mytl = new ThreadLocal<Object>(){

        @Override
        protected Object initialValue() {
            return null;
        }
    };

    private class MyIntTask implements Runnable {
        @Override
        public void run() {
            if (MyThreadLocal.mytl.get() == null) {

            }
        }
    }
}
