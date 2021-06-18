package org.ray.study.chapter10;

/**
 * Q1
 */
public class Outer {
    private String name;

    public Outer(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Outer outer = new Outer("OuterClass");
        Outer.Inner inner = outer.new Inner();      // .new的使用
//        Outer.Inner inner = outer.getInner();
        System.out.println(inner.toString());
    }

    public Inner getInner() {
        return new Inner();
    }

    class Inner {
        public String toString() {
            return name;
        }
    }
}
