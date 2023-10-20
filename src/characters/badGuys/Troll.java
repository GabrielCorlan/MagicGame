package characters.badGuys;

import armors.ClothRobe;
import characters.Character;
import characters.Group;
import weapons.Sword;

public class Troll extends BadGuys {

    private final ClothRobe DEFAULT_BODY_ARMOR = new ClothRobe();

    public Troll(){
        this("Troll", 1);
    }

    public Troll(String name, int level){
        this(name, level, 100);
    }

    public Troll(String name, int level, int health) {
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

    public int smash(){
        // TODO: Implement
        return 15;
    }

    public int headBite(){
        return super.getWeapon().getDamagePoints() + 10;
    }

    public int petrify(){
        return super.getArmor().getArmorPoints() + 5;
    }

    @Override
    public int attack() {
        return smash();
    }

    @Override
    public int specialAttack() {
        return headBite();
    }

    @Override
    public int defend() {
        return petrify();
    }
}
