package armors;

public class Armor {

    private int armorPoints;

    public int getArmorPoints() {
        return armorPoints;
    }

    public void setArmorPoints(int armorPoints) {
        if (armorPoints >= 0)
            this.armorPoints = armorPoints;
        else
            System.out.println("Armor Points value should be a positive number");
    }
}
