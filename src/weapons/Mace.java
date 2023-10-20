package weapons;

import interfaces.ISpecialAbility;

public class Mace extends Weapon implements ISpecialAbility {
    private static final int DEFAULT_DAMAGE_POINTS = 10;

    public Mace(int armorPoints) {
        super.setDamagePoints(armorPoints);
    }

    public Mace(){
        this(DEFAULT_DAMAGE_POINTS);
    }

    @Override
    public void specialAbility() {
        powerSmash();
    }

    public void powerSmash(){
        // TODO: Implement
    }
}
