package CounterContructors;

public class Main {
    public static void main(String[] args) {

        Counter counter1 = new Counter(5); // Create a counter with start value of 5
        System.out.println("Initial counter value: " + counter1.value());

        Counter counter2 = new Counter(); // Create a counter with start value of 0
        System.out.println("Counter start: "+counter2.value());

        counter1.increase();// Increase counter1 by 1 and print its value
        System.out.println("Counter 1 value increased by 1= " + counter1.value());

        counter2.increase(7);
        System.out.println("counter 2 increased by 7 = "+counter2.value());

        counter2.decrease(2);// Decrease counter2 by 2 and print its value
        System.out.println("Counter 2 decreased by 2 = " + counter2.value());


        counter1.increase(5);// Increase counter1 by 5 and print its value
        System.out.println("Counter 1 value increased by 5 = " + counter1.value());


        counter2.decrease(-3);// Decrease counter2 by -3 (which does nothing) and print its value
        System.out.println("Counter 2 value: " + counter2.value());
    }
}
