import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        for (Animal animal : animals)
            System.out.println(animal.show());
    }
}