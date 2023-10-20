package characters.goodGuys;

import armors.ClothRobe;
import armors.LeatherVest;
import characters.Character;
import characters.Group;
import weapons.Bow;
import weapons.Knife;

public class Wizard extends GoodGuys {

    private final Knife DEFAULT_WEAPON = new Knife();
    private final ClothRobe DEFAULT_BODY_ARMOR = new ClothRobe();

    public Wizard(){
        this("Wizard", 1);
    }

    public Wizard(String name, int level){
        this(name, level, 100);
    }

    public Wizard(String name, int level, int health) {
        super.setName(name);
        super.setLevel(level);
        super.setHealth(health);
        super.setAbilityPoints(100);
        super.setArmor(DEFAULT_BODY_ARMOR);
        super.setWeapon(DEFAULT_WEAPON);
        // TODO: implement characters.Group enum
        super.setGroup(Group.GoodGuys);
        super.setAlive(true);
        super.setScores(0);
    }

    public int castSpell(){
        // TODO: Implement
        return 25;
    }

    public int stickAttack(){
        return super.getWeapon().getDamagePoints() + 10;
    }

    public int castProtectiveShield(){
        return super.getArmor().getArmorPoints() + 5;
    }

    @Override
    public int attack() {
        return castSpell();
    }

    @Override
    public int specialAttack() {
        return stickAttack();
    }

    @Override
    public int defend() {
        return castProtectiveShield();
    }
}
