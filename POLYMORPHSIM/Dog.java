package POLYMORPHSIM;

public class Dog extends Mammal{
    private int paroshim;

    public Dog(String name, String gender, int age, double weight, double milkUsage, int paroshim) {
        super(name, gender, age, weight, milkUsage);
        this.paroshim = paroshim;
    }

    public int getParoshim() {
        return paroshim;
    }

    public void setParoshim(int paroshim) {
        this.paroshim = paroshim;
    }

    public void removeParoshim(){
        this.paroshim = 0;
    }

    @Override
    public void makeSound(){
        System.out.println("I am a dog, hoow hoooooooooow");
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + "paroshim: " + this.paroshim;
    }
}
