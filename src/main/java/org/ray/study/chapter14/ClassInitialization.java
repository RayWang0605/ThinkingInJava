package org.ray.study.chapter14;

import java.util.Random;

class Initailable {
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);

}

public class ClassInitialization {
    public static Random rand = new Random(47);

}
