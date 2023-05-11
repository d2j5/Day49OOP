public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle( 1997,  "Honda", "prelude","red");


        System.out.println(vehicle.getColor());
        vehicle.setColor("Blue");
        System.out.println(vehicle.getColor());
    }

}