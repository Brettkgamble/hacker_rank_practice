package Animal;

public class Dog extends Animal {

    //Constructor
    public Dog() {
        super(15);
        System.out.println("A dog has been created!");
    }

    public void ruff() {
        System.out.println("The dog says Ruff!");
    }

    public void run() {
        System.out.println("The dog is running!");
    }

}
