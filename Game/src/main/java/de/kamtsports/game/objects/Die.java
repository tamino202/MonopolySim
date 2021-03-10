package de.kamtsports.game.objects;

import de.kamtsports.game.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Die {

    private static final List<Integer> rolls= new ArrayList<>();

    public static void roll(int amount){
        rolls.clear();
        for (int i = 0; i <amount ; i++) {
            rolls.add(ThreadLocalRandom.current().nextInt(Game.settings.getDieType().min, Game.settings.getDieType().max+1));
        }
    }

    public static List<Integer> getLastRolls() {
        return rolls;
    }
}
