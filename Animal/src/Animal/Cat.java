package Animal;

public class Cat extends Animal{

    //Constructor
    public Cat() {
        super(7);
        System.out.println("A cat has been created!");
    }

    public void eat() {
        System.out.println("A cat is eating");
    }

    public void meow() {
        System.out.println("The cat says Meow!");
    }

    public void prance() {
        System.out.println("The cat is prancing!");
    }

}
