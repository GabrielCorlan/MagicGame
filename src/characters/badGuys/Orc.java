package characters.badGuys;

import armors.ClothRobe;
import characters.Character;
import characters.Group;
import weapons.Sword;

public class Orc extends BadGuys {

    private final ClothRobe DEFAULT_BODY_ARMOR = new ClothRobe();

    public Orc(){
        this("Orc", 1);
    }

    public Orc(String name, int level){
        this(name, level, 100);
    }

    public Orc(String name, int level, int health) {
        super.setName(name);
        super.setLevel(level);
        super.setHealth(health);
        super.setAbilityPoints(100);
        super.setArmor(DEFAULT_BODY_ARMOR);
        // TODO: implement characters.Group enum
        super.setGroup(Group.BadGuys);
        super.setAlive(true);
        super.setScores(0);
    }

    public int clawsAttack(){
        // TODO: Implement
        return 20;
    }

    public int headBite(){
        return super.getWeapon().getDamagePoints() + 10;
    }

    public int strain(){
        return super.getArmor().getArmorPoints() + 5;
    }

    @Override
    public int attack() {
        return clawsAttack();
    }

    @Override
    public int specialAttack() {
        return headBite();
    }

    @Override
    public int defend() {
        return strain();
    }
}
