package org.ray.study.chapter3.demo1;

public class ObjCompare {
    public static void main(String[] args) {
        Integer integer1 = new Integer(10);
        Integer integer2 = new Integer(10);

        // 默认比较integer对象的地址，而两者存放于不同的位置，因此两个对象不可能相等
        System.out.println(integer1 == integer2);
        System.out.println(integer1 != integer2);

        // 若要比较两者是否相等，对于非基本类型，需要采用equals方法
        // 如下：
        System.out.println("包装类型： " + (integer1.equals(integer2)));

        // 基本类型可以直接比较
        int num1 = 12;
        int num2 = 12;
        System.out.println("基本类型： " + (num1 == num2));

        // 自定义类型比较
        Value value1 = new Value(3);
        Value value2 = new Value(3);
        // 由于非基本类型，因此直接比较还是在比较地址，不可能相等
        // 采用equals方法同样不会相等
        // 对于自定义类型，若需要采用equlas方法，必须在类中重写equals方法，定义自己的比较逻辑，才能正确达到比较的效果
        System.out.println("自定义类型： " + (value1 == value2));
        System.out.println("自定义类型equals： " + (value1.equals(value2)));

    }
}

class Value {
    int num;

    public Value(int num) {
        this.num = num;
    }
}
