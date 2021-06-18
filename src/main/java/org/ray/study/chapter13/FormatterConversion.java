package org.ray.study.chapter13;

import java.util.Formatter;

public class FormatterConversion {
    public static void main(String[] args) {
        Formatter formatter = new Formatter(System.out);
        char test = 'a';
//        formatter.format("d: %d\n", test);
        formatter.format("c: %c\n", test);
        formatter.format("b: %b\n", test);
        formatter.format("s: %s\n", test);
//        formatter.format("f: %f\n", test);
//        formatter.format("e: %e\n", test);
//        formatter.format("x: %x\n", test);
        formatter.format("h: %h\n", test);
    }
}
