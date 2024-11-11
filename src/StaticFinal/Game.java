package StaticFinal;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private static final int MAX_COUNT = 6;
    public List<Player> players = new ArrayList<>();
    private int countPlayers = 0;

    public void addPlayer(String name) {
        if (countPlayers < MAX_COUNT) {
            countPlayers++;
            Player newPlayer = new Player(name);
            players.add(newPlayer);
            System.out.println("Введен новый игрок : " + name);
        } else {
            System.out.println("Игроков нужное количество");

        }
    }

    public List<Player> getPlayers(int index) {
        return players;
    }

    public int getCountPlayers() {
        return countPlayers;
    }

    @Override
    public String toString() {
        return STR."players = \{players}";
    }

    public Object contains(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void playerRun(String name) {
        if (playerStamina(name) != Player.MIN_STAMINA) {
            for (Player player : players) {
                if (player.getName().equals(name)) {
                    player.run();
                }
            }

        } else {
            deletePlayer(name);
        }
    }

    public void deletePlayer(String name) {
        players.removeIf(player -> player.getName().equals(name));
        System.out.println("Игрок выведен из игры : " + name);
    }

    public int playerStamina(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return player.getStamina();
            }
        }
        return 0;
    }
}


