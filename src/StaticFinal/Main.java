package StaticFinal;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println(game.getPlayers(2));

        game.addPlayer("Jord");
        game.addPlayer("Jane");
        game.addPlayer("Bob");

        game.addPlayer("Mary");
        game.addPlayer("Jord");
        game.addPlayer("Lord");

        game.addPlayer("Запасной)");

        System.out.println(STR."есть ли Jord " + game.contains("Jord"));
        System.out.println(STR."есть ли Sergey " + game.contains("Sergey"));
        System.out.println(STR."есть ли Jane " + game.contains("Jane"));

        System.out.println(game);
        game.playerRun("Mary");
        game.playerRun("Sergey");
        game.playerRun("Jane");

        game.deletePlayer("Mary");
        game.deletePlayer("Sergey");
        game.playerStamina("Bob");

        for (int i = game.playerStamina("Jane"); i >= Player.MIN_STAMINA;i-- ) {
            game.playerRun("Jane");

        }


    }
}

