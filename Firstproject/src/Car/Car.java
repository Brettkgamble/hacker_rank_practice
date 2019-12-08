package Car;

/**
 *
 * @author brettgamble
 *
 */

public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";

    public void printVariables() {
        System.out.println("This is the maxSpeed " + maxSpeed);
        System.out.println("This is the minSpeed " + minSpeed);
        System.out.println("This is the weight " + weight);
        System.out.println("The car is on " + isTheCarOn);
        System.out.println("This is the condition " + condition);
        System.out.println("This is the name " + nameOfCar);
    }

    public void wreckCar() {
        condition = 'C';
    }

    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Car familyCar = new Car();
        System.out.println("Families car");
        familyCar.printVariables();
        Car brettCar = familyCar;
        familyCar.wreckCar();
        familyCar.upgradeMinSpeed();
        System.out.println("Families car after upgrade");
        familyCar.printVariables();
        System.out.println("Alices car");
        brettCar.printVariables();
    }
}
