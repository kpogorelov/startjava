package org.example;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "Male";
        wolfOne.age = 6;
        wolfOne.color = "Grey";
        wolfOne.name = "Iron Wolf";
        wolfOne.weight = 50.4f;

        System.out.println("Name - " + wolfOne.name);
        System.out.println("Gender - " + wolfOne.gender);
        System.out.println("Age - " + wolfOne.age);
        System.out.println("Color - " + wolfOne.color);
        System.out.println("Weight - " + wolfOne.weight);

        wolfOne.howl();
        wolfOne.hunt();
        wolfOne.run();
        wolfOne.sit();
        wolfOne.walk();
    }
}
