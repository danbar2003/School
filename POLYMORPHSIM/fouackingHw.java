package POLYMORPHSIM;

public class fouackingHw {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("tuval", "Male", 15, 80, 3213, 100);
        animals[1] = new Dog("eran", "female", 16, 79, 123123, 3);
        animals[2] = new Cat("beni", "male", 16, 68, 9999, true);

        for (Animal temp : animals) {
            System.out.println(temp.toString());
        }
        for (Animal temp : animals) {
            if (((Mammal) temp) instanceof Dog)
                ((Dog) temp).makeSound();
            if (((Mammal) temp) instanceof Cat)
                ((Cat) temp).makeSound();
        }
            for (Animal temp : animals) {
                if (((Mammal) temp) instanceof Dog) {
                    ((Dog) temp).removeParoshim();
                }
                if (((Mammal) temp) instanceof Cat) {
                    ((Cat) temp).setStreetCat(false);
                }
            }
        }
    }
