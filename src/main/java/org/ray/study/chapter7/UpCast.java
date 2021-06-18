package org.ray.study.chapter7;

public class UpCast {
    public static void main(String[] args) {
        Wind wind = new Wind();
        Instrument.tune(wind);
    }
}

class Instrument {
    public void play() {}
    static void tune(Instrument instrument) {
        instrument.play();
        System.out.println("playing");
    }
}

class Wind extends Instrument {}
