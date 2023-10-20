package weapons;

public abstract class Weapon {

    private int damagePoints;

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        if (damagePoints >= 0)
            this.damagePoints = damagePoints;
        else
            System.out.println("Damage points value should be a positive number");
    }

    public abstract void specialAbility();

}
