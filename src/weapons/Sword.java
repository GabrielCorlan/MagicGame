package weapons;

import interfaces.ISpecialAbility;

public class Sword extends Weapon implements ISpecialAbility {
    private static final int DEFAULT_DAMAGE_POINTS = 10;

    public Sword(int armorPoints) {
        super.setDamagePoints(armorPoints);
    }

    public Sword(){
        this(DEFAULT_DAMAGE_POINTS);
    }

    @Override
    public void specialAbility() {
        decapitate();
    }

    public void decapitate(){
        // TODO: Implement
    }
}
