package characters.goodGuys;

import armors.ClothRobe;
import armors.LeatherVest;
import characters.Character;
import characters.Group;
import weapons.Bow;
import weapons.Knife;
import weapons.Sword;

public class Elf extends GoodGuys {

    private final Knife DEFAULT_WEAPON = new Knife();
    private final Bow SPECIAL_WEAPON = new Bow();
    private final LeatherVest DEFAULT_BODY_ARMOR = new LeatherVest();

    public Elf(){
        this("Elf", 1);
    }

    public Elf(String name, int level){
        this(name, level, 100);
    }

    public Elf(String name, int level, int health) {
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

    public int knifeAttack(){
        // TODO: Implement
        return 15;
    }

    public int shootArrows(){
        return super.getWeapon().getDamagePoints() + 10;
    }

    public int restoreHealth(){
        return super.getArmor().getArmorPoints() + 5;
    }

    @Override
    public int attack() {
        return knifeAttack();
    }

    @Override
    public int specialAttack() {
        return shootArrows();
    }

    @Override
    public int defend() {
        return restoreHealth();
    }
}
