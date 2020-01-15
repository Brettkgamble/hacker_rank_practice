package Animal;

public abstract class Animal {

    private int age;

    public Animal(int age) {
        this.age = age;
        System.out.println("An animal has been created!");
    }

    public abstract void eat();

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        System.out.println(d.getAge());
        d.ruff();
        c.meow();
        System.out.println(c.getAge());
        d.eat();
        c.eat();
        d.run();
        c.prance();

    }
}
