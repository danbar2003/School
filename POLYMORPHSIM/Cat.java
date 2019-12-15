package POLYMORPHSIM;

public class Cat extends Mammal{

    private boolean isStreetCat;

    public boolean isStreetCat() {
        return isStreetCat;
    }

    public void setStreetCat(boolean streetCat) {
        this.isStreetCat = streetCat;
    }

    public Cat(String name, String gender, int age, double weight, double milkUsage, boolean isStreetCat) {
        super(name, gender, age, weight, milkUsage);
        this.isStreetCat = isStreetCat;
    }

    public void becomeStreetCat(){
        this.setStreetCat(true);
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + "is a street cat: " + this.isStreetCat;
    }
}
