package startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyAvenger = new Jaeger();
        gipsyAvenger.setModelName("gipsyAvenger");
        gipsyAvenger.setArmor(0);
        gipsyAvenger.setHeight(81.77f);
        gipsyAvenger.setWeight(2.004f);
        gipsyAvenger.setSpeed(10);
        gipsyAvenger.setStrength(4);
        System.out.println(gipsyAvenger);
        gipsyAvenger.attackKaiju();
        gipsyAvenger.isCdSkills();

        Jaeger crimsonTyphoon = new Jaeger("crimsonTyphoon", 1.722f, 76.2f, 9, 6, 8);
        System.out.println(crimsonTyphoon);
        crimsonTyphoon.attackKaiju();
        crimsonTyphoon.isCdSkills();
        crimsonTyphoon.setSpeed(5);
        crimsonTyphoon.isCdSkills();

        crimsonTyphoon.setModelName(null);
        System.out.println(crimsonTyphoon.getModelName());
        crimsonTyphoon.setModelName("Теперь меня зовут Вася, но точно не null");
        System.out.println(crimsonTyphoon.getModelName());
    }
}
