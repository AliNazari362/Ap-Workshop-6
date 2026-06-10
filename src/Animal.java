abstract public class Animal {

    private String name;
    private int age;
    private String desc;

    public Animal(String name, int age, String desc) {
        this.name = name;
        this.age = age;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDesc() {
        return desc;
    }

    public abstract String show();
}