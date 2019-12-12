package POLYMORPHSIM;

public class Animal {

    public Animal(String name, String gender, int age, double weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    private String name;
    private String gender;
    private int age;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n" + "Gender: " + this.gender + "\n" + "Age: " + this.age + "\n" + "Weight: " + this.weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
