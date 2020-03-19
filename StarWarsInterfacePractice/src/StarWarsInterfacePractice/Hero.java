package StarWarsInterfacePractice;

public class Hero implements Character {
    public String weapon = "The Force";

    public String getWeapon() {
        return weapon;
    }

    public void attack() {
        System.out.println("The Hero attacks the Enemy!!!");

    }
    public void heal() {
        System.out.println("The hero heals you!");

    }


}
