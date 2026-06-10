public class Girafe extends Mammal implements Prey {

    public Girafe(String name, int age, String desc, int speed) {
        super(name, age, desc, speed);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String alert(Hunter hunter) {
        return "I am " + name + " and I running from " +
                hunter.getClass().getSimpleName() + "!!";
    }
}
