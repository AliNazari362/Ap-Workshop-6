import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        Cheetah cheetah1 = new Cheetah("Cheetah", 25, "very fast", 85);
        Eagle eagle1 = new Eagle("Eagle", 2, "dangerous", 40);
        Parrot parrot1 = new Parrot("Parrot", 4, "cute", 3);
        Girafe girafe1 = new Girafe("Girafe", 3, "normal animal!", 10);

        animals.add(cheetah1);
        animals.add(eagle1);
        animals.add(parrot1);
        animals.add(girafe1);

        Cheetah cheetah2 = new Cheetah("Cheetah", 3, "very fast and wild", 100);
        Eagle eagle2 = new Eagle("Eagle", 5, "dangerous", 25);
        Parrot parrot2 = new Parrot("Parrot", 2, "cute and nice", 3);
        Girafe girafe2 = new Girafe("Girafe", 10, "normal animal and cute", 35);

        animals.add(cheetah2);
        animals.add(eagle2);
        animals.add(parrot2);
        animals.add(girafe2);

        System.out.println();
        for (Animal animal : animals) System.out.println(animal.show());

        System.out.println();
        System.out.println(cheetah2.hunt(parrot1));
        System.out.println(eagle1.hunt(girafe1));
        System.out.println(cheetah1.hunt(girafe2));
        System.out.println(eagle2.hunt(parrot2));
    }
}