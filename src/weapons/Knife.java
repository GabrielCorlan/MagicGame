package weapons;

import interfaces.ISpecialAbility;

public class Knife extends Weapon implements ISpecialAbility {
    private static final int DEFAULT_DAMAGE_POINTS = 10;

    public Knife(int armorPoints) {
        super.setDamagePoints(armorPoints);
    }

    public Knife(){
        this(DEFAULT_DAMAGE_POINTS);
    }

    @Override
    public void specialAbility() {
        multiStab();
    }

    public void multiStab(){
        // TODO: Implement
    }
}
