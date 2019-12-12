package POLYMORPHSIM;

public class Cat extends Mammal{
    private boolean isStreetCat;

    public boolean isStreetCat() {
        return isStreetCat;
    }

    public void setStreetCat(boolean streetCat) {
        this.isStreetCat = streetCat;
    }

    public Cat(String name, String gender, int age, double weight, String milkUsage, boolean isStreetCat) {
        super(name, gender, age, weight, milkUsage);
        this.isStreetCat = isStreetCat;
    }

    public void becomeStreetCat(){
        this.setStreetCat(true);
    }
}
