public class Eagle extends Bird implements Hunter {

    public Eagle(String name, int age, String desc, int hight) {
        super(name, age, desc, hight);
    }

    @Override
    public String hunt(Prey prey) {
        return name + " hunted " + prey.getName();
    }
}