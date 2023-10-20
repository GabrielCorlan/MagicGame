package weapons;

import interfaces.ISpecialAbility;

public class Spear extends Weapon implements ISpecialAbility {
    private static final int DEFAULT_DAMAGE_POINTS = 10;

    public Spear(int armorPoints) {
        super.setDamagePoints(armorPoints);
    }

    public Spear(){
        this(DEFAULT_DAMAGE_POINTS);
    }

    @Override
    public void specialAbility() {
        throwSpear();
    }

    public void throwSpear(){
        // TODO: Implement
    }
}
