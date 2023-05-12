package OverloadAnimals;



public class Animal {
    private String name;
    private boolean isDog;
    private String breed;
    private String size;


    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public Animal(String name, boolean isDog, String breed) {
        this.name = name;
        this.isDog = isDog;
        this.breed = breed;
    }
    public Animal(String name, boolean isDog, String breed, String size) {
        this.name = name;
        this.isDog = isDog;
        this.breed = breed;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public boolean getIsDog() {
        return isDog;
    }

    public String getBreed() {
        return breed;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {

        return  this.name + " is a dog = " + this.isDog+"\n"+
                this.name + "'s breed is "+this.breed+", and it's size is: "+this.size;
    }
}
