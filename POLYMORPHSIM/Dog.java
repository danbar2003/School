package POLYMORPHSIM;

public class Dog extends Mammal{
    private int paroshim;

    public Dog(String name, String gender, int age, double weight, String milkUsage, int paroshim) {
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
}
