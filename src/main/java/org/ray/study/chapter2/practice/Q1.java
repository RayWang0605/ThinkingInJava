package org.ray.study.chapter2.practice;

public class Q1 {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.age);
        System.out.println(test.type);
    }

    public static class Test{
        int age;
        char type;
    }
}

