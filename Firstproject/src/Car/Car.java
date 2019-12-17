package Car;

import java.awt.desktop.SystemEventListener;

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

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;

    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;

    public Car() {

    }

    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }

    public int getMinSpeed() {
        return this.minSpeed;
    }

    public double getWeight() {
        return this.weight;
    }

    public boolean getIsTheCarOn() {
        return this.isTheCarOn;
    }

    public void printVariables() {
        System.out.println("This is the maxSpeed " + maxSpeed);
        System.out.println("This is the minSpeed " + minSpeed);
        System.out.println("This is the weight " + weight);
        System.out.println("The car is on " + isTheCarOn);
        System.out.println("This is the condition " + condition);
        System.out.println("This is the name " + nameOfCar);
        System.out.println("Number of People in car: " + numberOfPeopleInCar);
    }

    public void wreckCar() {
        condition = 'C';
    }

    public void upgradeMaxSpeed() {
        setMaxSpeed(getMaxSpeed() + 10);
    }

    public void getIn() {
        if(numberOfPeopleInCar < maxNumberOfPeopleInCar ) {
            numberOfPeopleInCar++;
        } else {
            System.out.println("The car is full!" + numberOfPeopleInCar + " = " + maxNumberOfPeopleInCar );
        }
    }

    public void getOut() {
        if(numberOfPeopleInCar > 0){
            numberOfPeopleInCar--;
        } else {
            System.out.println("No one is in the car");
        }
    }

    public double howManyMilesTilOutOfGas() {
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }

    public void turnTheCarOn() {
       if(!isTheCarOn){
           isTheCarOn=true;
       } else {
           System.out.println("The Car is already on");
       }
    }

    public static void main(String[] args) {
       Car tommyCar = new Car();
       tommyCar.getOut();
       tommyCar.getOut();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.turnTheCarOn();
       tommyCar.turnTheCarOn();
    }
}
