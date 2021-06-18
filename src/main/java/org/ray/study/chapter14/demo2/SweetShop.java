package org.ray.study.chapter14.demo2;

class IceCream {
    static {
        System.out.println("Loading IceCream");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("-----main start-----");
        new Candy();
        System.out.println("-----Candy loaded-----");
        try{
            Class.forName("Gum");
        }catch (ClassNotFoundException e) {
            System.out.println("-----ClassNotFoundException-----");
        }
        new Cookie();
        System.out.println("-----Cookie loaded-----");
        try{
            Class.forName("IceCream");
        }catch (ClassNotFoundException e) {
            System.out.println("-----ClassNotFoundException-----");
        }
    }
}

