package POLYMORPHSIM;

public class Mammal extends Animal{
    private String milkUsage;

    public String getMilkUsage() {
        return milkUsage;
    }

    public void setMilkUsage(String milkUsage) {
        this.milkUsage = milkUsage;
    }

    public Mammal(String name, String gender, int age, double weight, String milkUsage) {
        super(name, gender, age, weight);
        this.milkUsage = milkUsage;
    }

    public void makeSound(){
        System.out.println("I am fucking mammal");
    }
}
