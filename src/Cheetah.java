public class Cheetah extends Mammal implements Hunter {

    public Cheetah(String name, int age, String desc, int speed) {
        super(name, age, desc, speed);
    }

    @Override
    public String hunt(Prey prey) {
        return name + " hunted " + prey.getName();
    }
}