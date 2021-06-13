package org.ray.study.chapter3.demo1;


/**
 *  短路现象
 *  本例中，三个比较，只执行了前两个，第三个没有执行
 *  由于条件1为真，因此会继续执行，条件2为假，后续运算符为&&，后面的条件3无论结果如何，最终输出都为false
 *  因此无需再执行条件3
 *  这种短路现象可以获得潜在的性能提升
 */

public class ShortCircuit {
    public static void main(String[] args) {
        CompareToNum compareToNum1 = new CompareToNum(1);
        CompareToNum compareToNum2 = new CompareToNum(-1);
        CompareToNum compareToNum3 = new CompareToNum(3);

        boolean result = (compareToNum1.lagerThanZero(compareToNum1.num)
                        && compareToNum2.lagerThanZero(compareToNum2.num)
                        && compareToNum3.lagerThanZero(compareToNum3.num));

        System.out.println("result: " + result);
    }

    static class CompareToNum {
        int num;

        public CompareToNum() {}

        public CompareToNum(int num) {
            this.num = num;
        }

        public boolean lagerThanZero(int num) {
            System.out.println("test: " + num);
            if(num > 0)  {
                return true;
            }
            else {
                return false;
            }
        }
    }
}
