package armors;

public class Shield extends Armor{
    private static final int DEFAULT_ARMOR_POINTS = 10;

    public Shield(int armorPoints) {
        super.setArmorPoints(armorPoints);
    }

    public Shield() {
        this(DEFAULT_ARMOR_POINTS);
    }
}
