package Animal;

public abstract class Animal {

    private int age;

    public Animal(int age) {
        this.age = age;
        System.out.println("An animal has been created!");
    }

    public void sleep() {
        System.out.println("An Animal is Sleeping");
    }

    public abstract void eat();

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.eat();
        c.eat();
        d.sleep();
        c.sleep();

        // Casting
        Object dog = new Dog();
        Dog realDog = (Dog) dog;
        realDog.ruff();
    }
}
