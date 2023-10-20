package weapons;


import interfaces.ISpecialAbility;

public class Bow extends Weapon implements ISpecialAbility {

    private static final int DEFAULT_DAMAGE_POINTS = 10;

    public Bow(int armorPoints) {
        super.setDamagePoints(armorPoints);
    }

    public Bow(){
        this(DEFAULT_DAMAGE_POINTS);
    }

    @Override
    public void specialAbility() {
        shotExplosiveArrows();
    }

    public void shotExplosiveArrows(){
        // TODO: Implement
    }
}
