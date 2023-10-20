import characters.Character;
import characters.badGuys.BadGuys;
import characters.badGuys.Goblin;
import characters.badGuys.Orc;
import characters.badGuys.Troll;
import characters.goodGuys.Elf;
import characters.goodGuys.GoodGuys;
import characters.goodGuys.Knight;
import characters.goodGuys.Wizard;
import tools.Colors;
import tools.Tools;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class TestClient {
    public static void main(String[] args) throws IOException {


        boolean gameOver = false;

        Random rng = new Random();

        GoodGuys currentGoodGuy;
        BadGuys currentBadGuy;

        ArrayList<Character> characters = new ArrayList<>(Arrays.asList(new Goblin(), new Troll(), new Orc(), new Elf(), new Knight(), new Wizard()));

        ArrayList<GoodGuys> goodGuysTeam = new ArrayList<>();
        ArrayList<BadGuys> badGuysTeam = new ArrayList<>();

        for (Character character : characters) {
            if (character instanceof GoodGuys) {
                goodGuysTeam.add((GoodGuys) character);
            } else if (character instanceof BadGuys) {
                badGuysTeam.add((BadGuys) character);
            }
        }

        PlayersInfo.initialize(characters);

        while (!gameOver) {

            if (goodGuysTeam.size() > 1)
                currentGoodGuy = goodGuysTeam.get(rng.nextInt(goodGuysTeam.size()));
            else currentGoodGuy = goodGuysTeam.get(0);

            if (badGuysTeam.size() > 1)
                currentBadGuy = badGuysTeam.get(rng.nextInt(goodGuysTeam.size()));
            else currentBadGuy = badGuysTeam.get(0);

            currentBadGuy.takeDamage(currentGoodGuy.attack(), currentGoodGuy.getName(), currentGoodGuy.getClass().toString());

            if (!currentBadGuy.isAlive()) {
                currentGoodGuy.wonBattle();
                badGuysTeam.remove(currentBadGuy);

                if (badGuysTeam.size() <= 0) {
                    Tools.colorfulPrint("Good guys team wins!", Colors.RED);
                    break;
                } else {
                    currentBadGuy = badGuysTeam.get(rng.nextInt(badGuysTeam.size()));
                }
            }

            currentGoodGuy.takeDamage(currentBadGuy.attack(), currentBadGuy.getName(), currentBadGuy.getClass().toString());

            if (!currentGoodGuy.isAlive()) {
                currentBadGuy.wonBattle();
                goodGuysTeam.remove(currentGoodGuy);

                if (goodGuysTeam.size() <= 0) {
                    Tools.colorfulPrint("Bad guys team wins!", Colors.RED);
                    break;
                } else {
                    currentGoodGuy = goodGuysTeam.get(rng.nextInt(goodGuysTeam.size()));
                }
            }
        }
    }
}
