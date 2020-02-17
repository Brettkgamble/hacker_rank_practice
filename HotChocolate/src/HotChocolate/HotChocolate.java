package HotChocolate;

public class HotChocolate {

    public static final double tooHot = 185;
    public static final double tooCold = 160;

    public static void drinkHotChocolate(double cocoaTemp) throws TooColdException,
            TooHotException {
        if (cocoaTemp >= tooHot) {
            throw new TooHotException();
        } else if (cocoaTemp <= tooCold) {
            throw new TooColdException();
        }
    }

    public static void main(String[] args){
        double currentCocoaTemp = 190;
        try {
            drinkHotChocolate(currentCocoaTemp);
            System.out.println("That cocoa was good.");
        } catch (TooHotException e1) {
            System.out.println("That's too hot!");
        } catch (TooColdException e2) {
            System.out.println("That's too cold!");
        }
            System.out.println("And it is gone!");
    }
}
