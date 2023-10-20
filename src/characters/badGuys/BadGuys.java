package characters.badGuys;

import characters.Character;

public abstract class BadGuys extends Character {
    private int abilityPoints;

    public int getAbilityPoints() {
        return abilityPoints;
    }

    public void setAbilityPoints(int abilityPoints) {
        if (abilityPoints >= 0 && abilityPoints <= 100)
            this.abilityPoints = abilityPoints;
        else
            System.out.println("Inappropriate value, the value should be >= 0 and <= 100.");
    }
}
