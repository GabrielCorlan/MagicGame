package armors;

public class ClothRobe extends Armor{
    private static final int DEFAULT_ARMOR_POINTS = 10;

    public ClothRobe(int armorPoints) {
        super.setArmorPoints(armorPoints);
    }

    public ClothRobe() {
        this(DEFAULT_ARMOR_POINTS);
    }
}
