package Person;

import static Person.HairColor.*;


public class Person {
    HairColor hairColor = BLACK;

    public Person() {

    }

    public static void main(String[] args) {
        Person peterParker = new Person();
        Person spiderman = peterParker;

        spiderman.hairColor = PINK;

        System.out.println("Hair Color of Peter PArker " + peterParker.hairColor);
        System.out.println("Hair Color of Spiderman " + spiderman.hairColor);
    }
}
