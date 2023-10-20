package characters.goodGuys;

import armors.LeatherVest;
import armors.Shield;
import characters.Character;
import characters.Group;
import weapons.Bow;
import weapons.Knife;
import weapons.Spear;
import weapons.Sword;

public class Knight extends GoodGuys {
    private final Sword DEFAULT_WEAPON = new Sword();
    private final Spear SPECIAL_WEAPON = new Spear();
    private final Shield DEFAULT_BODY_ARMOR = new Shield();

    public Knight(){
        this("Knight", 1);
    }

    public Knight(String name, int level){
        this(name, level, 100);
    }

    public Knight(String name, int level, int health) {
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

    public int swordAttack(){
        // TODO: Implement
        return 20;
    }

    public int spearAttack(){
        return super.getWeapon().getDamagePoints() + 10;
    }

    public int shieldParry(){
        return super.getArmor().getArmorPoints() + 5;
    }

    @Override
    public int attack() {
        return swordAttack();
    }

    @Override
    public int specialAttack() {
        return spearAttack();
    }

    @Override
    public int defend() {
        return shieldParry();
    }
}
