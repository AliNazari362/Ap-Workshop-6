public class Parrot extends Bird implements Prey {

    public Parrot(String name, int age, String desc, int height) {
        super(name, age, desc, height);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String alert(Hunter hunter) {
        return "I am " + name + " and I am running and flying from " +
                hunter.getClass().getSimpleName() + "!!";
    }
}
