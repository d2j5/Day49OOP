package OverloadAnimals;


import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");

        while (true) {
            System.out.print("Please enter a name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                System.out.println("Good bye!");
                break;
            }

            System.out.print("Is it a dog? yes or no: ");
            boolean isDog = scanner.nextLine().equalsIgnoreCase("yes");

            System.out.println("What is the breed of your pet?");
            String breed = scanner.nextLine();

            System.out.println("What is the size of your pet(large, medium, small)?");
            String size = scanner.nextLine();

            Animal animal = new Animal(name, isDog, breed, size);
            animalList.add(animal);
        }

        for (Animal animal : animalList) {
            System.out.println(animal.toString());
        }
    }
}
