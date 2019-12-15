package POLYMORPHSIM;

public class Mammal extends Animal{

    private double milkUsage;

    public double getMilkUsage() {
        return milkUsage;
    }

    public void setMilkUsage(double milkUsage) {
        this.milkUsage = milkUsage;
    }

    public void addMilk(double ammount){
        this.milkUsage += ammount;
    }

    public Mammal(String name, String gender, int age, double weight, double milkUsage) {
        super(name, gender, age, weight);
        this.milkUsage = milkUsage;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + "Milk Usage: " + this.milkUsage;
    }

    public void makeSound(){
        System.out.println("I am a mammal //sound");
    }
}
