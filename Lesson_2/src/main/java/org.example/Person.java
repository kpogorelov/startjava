package org.example;

public class Person {
    String gender = "Male";
    String name = "Petya";
    float height = 180.1f;
    float weight = 80.4f;
    int age = 24;

    void walk() {
        System.out.println("Я могу идти");
    }

    boolean sit() {
        return true;
    }

    String run() {
        return "Я могу бежать";
    }

    boolean talk() {
        return true;
    }

    void learnJava() {
        System.out.println("Я учу Java!");
    }
}
