package armors;

public class LeatherVest extends Armor{
    private static final int DEFAULT_ARMOR_POINTS = 10;

    public LeatherVest(int armorPoints) {
        super.setArmorPoints(armorPoints);
    }

    public LeatherVest() {
        this(DEFAULT_ARMOR_POINTS);
    }
}
