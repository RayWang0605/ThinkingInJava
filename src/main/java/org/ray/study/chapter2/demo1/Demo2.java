package org.ray.study.chapter2.demo1;

public class Demo2 {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println("----------------------------------------");
        System.out.println(System.getProperty("user.name"));
        System.out.println("----------------------------------------");
        System.out.println(System.getProperty("java.library.path"));
    }
}

