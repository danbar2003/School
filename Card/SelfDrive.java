package Card;

public class SelfDrive<T> implements SelfDrivable {
    private T chara;

    public SelfDrive(T chara) {
        this.chara = chara;
    }

    public void chooseLoc() {
        System.out.println();
    }

    public void executeDrive() {
        System.out.println();
    }

    public void makeSound() {
        System.out.println();
    }

    public T idk(){
        return this.chara;
    }
}
