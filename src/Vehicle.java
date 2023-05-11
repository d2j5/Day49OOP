public class Vehicle {
    private int year;
    private String make;
    private String model;
    private String color;
    public Vehicle(int year, String make, String model, String color) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("year: " + this.year);
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
    }

    public void drive() {
        System.out.println(String.join(this.color, this.model, "goes vroom vrrom"));
    }
        public void honk(){
            if (year < 1960){
                System.out.println("Horn: Ayoooooga");
            }
            else{
                System.out.println("Horn: Beep Beep");
            }
        }

     }
