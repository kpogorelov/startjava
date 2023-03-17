package org.example;

public class Wolf {
    String gender;
    String name;
    float weight;
    int age;
    String color;

    void walk() {
        System.out.println("Идет");
    }

    boolean sit() {
        System.out.println("Сидит");
        return true;
    }

    void run() {
        System.out.println("Бежит");
    }

    void howl() {
        System.out.println("Воет");
    }

    boolean hunt() {
        System.out.println("Охотится");
        return true;
    }

}
