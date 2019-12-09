package com.gzl.thread1;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        Demo1 demo = new Demo1();
//        linkedHashMap();
//        treesSet();
//        System.out.println(add1() + "");
//        System.out.println(add2() + "");
//        listRemove();
//        listRemove2();
    }

    private static void linkedHashMap() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("key1", "11");
        map.put(null, "nullkey");
        map.put("", "");
        System.out.println(map.get(null));

        TreeMap<String, Person> tree = new TreeMap<>();
        tree.put("p1", new Person("abbc"));
        tree.put("p2", new Person("bbc"));
        tree.put("p3", new Person("abbc"));

        System.out.println(tree);

    }
    private static void listRemove() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        for (String s : list) {
            if ("a".equals(s)) {
                list.remove(s);
            }
        }
        System.out.println(list);
    }

    private static void listRemove2() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if ("a".equals(s)) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    private static Double add1() {
        double a = 1234567.89;
        return a * 100;
    }

    private static strictfp Double add2() {
        double a = 1234567.89;
        return a * 100;
    }

    private static void treesSet() {
        TreeSet<Person> tree = new TreeSet<>();
        tree.add(new Person("abc"));
        tree.add(new Person("abc"));
        tree.add(new Person("abc"));
        tree.add(new Person("abc"));
        tree.add(new Person("fffbc"));
        tree.add(new Person("cbc"));
        tree.add(new Person("bcc"));
        System.out.println(tree);
    }

    static class Person implements Comparable<Person>{
        private String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(Person o) {
            return name.compareTo(o.getName());
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
