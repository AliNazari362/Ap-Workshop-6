abstract public class Mammal extends Animal{

    private int speed;

    public Mammal(String name, int age, String desc, int speed) {
        super(name, age, desc);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String show() {
        return getName() + ", age:" + getAge() + ", speed: " +
                getSpeed() + ", " + getDesc();
    }
}