package org.ray.study.chapter21.demo1;

public class BasicThreads {
    public static void main(String[] args) {
        Thread thread = new Thread(new LiftOff());
        thread.start();
        System.out.println("Waiting for Liftoff");
    }
}
