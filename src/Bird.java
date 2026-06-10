abstract public class Bird extends Animal {

    private int height;

    public Bird(String name, int age, String desc, int height) {
        super(name, age, desc);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String show() {
        return name + ", age:" + getAge() + ", height of fly: " +
                getHeight() + ", " + getDesc();
    }
}