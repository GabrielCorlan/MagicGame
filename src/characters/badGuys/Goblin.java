package characters.badGuys;

import armors.ClothRobe;
import characters.Character;
import characters.Group;
import weapons.Sword;
import weapons.Weapon;

public class Goblin extends BadGuys {

    private final Sword DEFAULT_WEAPON = new Sword();
    private final ClothRobe DEFAULT_BODY_ARMOR = new ClothRobe();

    public Goblin(){
        this("Goblin", 1);
    }

    public Goblin(String name, int level){
        this(name, level, 100);
    }

    public Goblin(String name, int level, int health) {
        super.setName(name);
        super.setLevel(level);
        super.setHealth(health);
        super.setAbilityPoints(100);
        super.setArmor(DEFAULT_BODY_ARMOR);
        super.setWeapon(DEFAULT_WEAPON);
        // TODO: implement characters.Group enum
        super.setGroup(Group.BadGuys);
        super.setAlive(true);
        super.setScores(0);
    }

    public int swordAttack(){
        // TODO: Implement
        return 10;
    }

    public int maceAttack(){
        return super.getWeapon().getDamagePoints() + 10;
    }

    public int restoreHealth(){
        return super.getArmor().getArmorPoints() + 5;
    }

    @Override
    public int attack() {
        return swordAttack();
    }

    @Override
    public int specialAttack() {
        return maceAttack();
    }

    @Override
    public int defend() {
        return restoreHealth();
    }
}
