package StaticFinal;

import java.util.Objects;
import java.util.Random;

public class Player {
    Random rand = new Random();
    private String name;
    public static final Integer MAX_STAMINA = 10;
    public static final Integer MIN_STAMINA = 0;
    private int stamina;
    static int countPlayers = 0;

    public Player(String name) {
        if (countPlayers < 6) {
            countPlayers++;
            this.name = name;
            this.stamina = rand.nextInt(8, MAX_STAMINA);
        } else {
            System.out.println("Игроков нужное количество");
        }
    }

    public String getName() {
        return name;
    }
    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (name != null) {
            stamina--;
            if (getStamina() > 0) {
                System.out.println(STR." выносливость \{getStamina()} \{getName()}");
            } else if (Objects.equals(stamina, MIN_STAMINA)) {
                System.out.println(" пошел отдыхать");
                countPlayers--;
            }

        }
    }

    public void info() {
        System.out.println(STR."На поле игроков \{countPlayers}");
        if (countPlayers < 6) {
            System.out.println(STR."Команды не полные- \{6 - countPlayers}" +
                    " свободно");
        } else {
            System.out.println("На поле не свободных мест");
        }
    }
}
