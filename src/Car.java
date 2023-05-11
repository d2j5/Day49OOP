public class Car extends Vehicle{
    public int numberOfDoors;

    public Car(int year, String make, String model, String color, int numberOfDoors) {
        super(year, make, model, color);
        this.numberOfDoors = numberOfDoors;
    }


    @Override public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of door: " + this.numberOfDoors);
    }
}

