package Animals;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");

        while (true) {
            System.out.print("Please enter a name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Is it a dog? yes or no: ");
            boolean isDog = scanner.nextLine().equalsIgnoreCase("yes");

            Animal animal = new Animal(name, isDog);
            animalList.add(animal);
        }

        for (Animal animal : animalList) {
            System.out.println(animal.toString());
        }
    }
}

