package ClassObjectConstructors;

public class Product {

     String name;
     double cost;
     int quantity;
        public Product(String name, double cost,  int quantity) {
        this.cost = cost;
        this.quantity = quantity;
        this.name = name;
    }


    public void totalCost(){
     double total = cost * quantity;
        System.out.println("Total cost is: $"+total);
        }
    public void printProduct(){
        System.out.println("The gram of "+name+" cost $"+cost+" and "+quantity+" were purchased.");
    }
}
