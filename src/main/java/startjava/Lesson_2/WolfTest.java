package startjava.Lesson_2;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("Woman");
        wolfOne.setAge(5);
        wolfOne.setColor("Grey");
        wolfOne.setName("Iron Wolf");
        wolfOne.setWeight(50.4f);

        System.out.println("Name - " + wolfOne.getName());
        System.out.println("Gender - " + wolfOne.getGender());
        System.out.println("Age - " + wolfOne.getAge());
        System.out.println("Color - " + wolfOne.getColor());
        System.out.println("Weight - " + wolfOne.getWeight());

        wolfOne.howl();
        wolfOne.hunt();
        wolfOne.run();
        wolfOne.sit();
        wolfOne.walk();
    }
}
