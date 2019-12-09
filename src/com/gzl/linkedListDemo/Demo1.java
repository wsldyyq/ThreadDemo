package com.gzl.linkedListDemo;

import java.io.File;
import java.util.LinkedList;

/**
 * @author guzl
 * @description
 * @date 2019-08-21
 */
public class Demo1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("111");
        ll.add("44");
        ll.add("33");
        ll.add("22");

        LinkedList<String> clone = (LinkedList)ll.clone();
        System.out.println(clone);
        ll.add("123");
        System.out.println(clone);

//        String fileEncode = getFileEncode("/Users/gzl/Desktop/需求/BR010599/PRODUCT_SMDB8_CMS_BR010599_集成总部推送SDK_谷子良_CREATE_创建表_UPDATE.sql");
//        System.out.println(fileEncode);
    }

}
