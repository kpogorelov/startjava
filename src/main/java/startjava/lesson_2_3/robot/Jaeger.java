package startjava.lesson_2_3.robot;

public class Jaeger {
    private String modelName;
    private float weight;
    private float height;
    private int speed;
    private int armor;
    private int strength;

    public Jaeger() {}

    public Jaeger(String modelName, float weight, float height, int speed, int armor, int strength) {
        this.modelName = modelName;
        this.weight = weight;
        this.height = height;
        this.speed = speed;
        this.armor = armor;
        this.strength = strength;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if (modelName != null) {
            this.modelName = modelName;
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void attackKaiju() {
        System.out.println(modelName + " атакует кайздзю");
    }

    public boolean isCdSkills() {
        System.out.println(modelName + " перезаряжает способности." + " Его скорость снизилась: была = " +
                +speed + ", стала = " + (speed - 1));
        return true;
    }

    @Override
    public String toString() {
        return "Jaeger{" +
                "modelName='" + modelName + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", speed=" + speed +
                ", armor=" + armor +
                ", strength=" + strength +
                '}';
    }
}
