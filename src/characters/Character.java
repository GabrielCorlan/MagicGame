package characters;

import armors.Armor;
import interfaces.Attackable;
import interfaces.Defendable;
import tools.Colors;
import tools.Tools;
import weapons.Weapon;

import java.awt.color.ColorSpace;

public abstract class Character implements Attackable, Defendable {

    private Weapon weapon;
    private Armor armor;
    private Group group;

    private boolean isAlive;

    private int health;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    private int level;
    private int scores;

    private String name;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health >= 0 && health <= 120)
            this.health = health;
        else
            System.out.println("Inappropriate value, the value should be >= 0 and <= 100.");
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level >= 0)
            this.level = level;
        else
            System.out.println("Inappropriate value, level should always be positive.");
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3 && name.length() <= 12)
            this.name = name;
        else
            System.out.println("Inappropriate length of name, name should be between 3 and 12 characters.");
    }

    public abstract int attack();

    public abstract int specialAttack();

    public abstract int defend();


    public void takeDamage(int damage, String attackerName, String type){

        if(defend() < damage){
            health -= damage + defend();

            if(health <= 0){
                isAlive = false;
            }
        }
        else {
            System.out.println("Haha! Your damage was not enough to harm me!");
        }

        if (!isAlive) {
            Tools.typeSpecificColorfulPrint(String.format("%s received %d damage from %s, and is now dead!", name, damage, attackerName), type);
        }
        else{
            Tools.typeSpecificColorfulPrint(String.format("%s received %d damage from %s, and now has %d health!", name, damage, attackerName, health), type);
        }
    }

    public void wonBattle(){
        scores++;

        if(scores % 10 == 0){
            level++;
        }
    }
}
