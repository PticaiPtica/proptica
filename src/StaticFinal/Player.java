package StaticFinal;

import java.util.Objects;
import java.util.Random;

public class Player {
    Random rand = new Random();
    private String name;
    public static final Integer MAX_STAMINA = 10;
    public static final Integer MIN_STAMINA = 0;
    private int stamina;


    public Player(String name) {
        this.name = name;
        this.stamina = rand.nextInt(8, MAX_STAMINA + 1);
    }

    public String getName() {
        return name;
    }

    public int getStamina() {
        return stamina;
    }

    @Override
    public String toString() {
        return "Player name=" + name + ", stamina=" + stamina
                ;
    }

    public void run() {
        if (name != null) {
            stamina--;
            if (getStamina() > 0) {
                System.out.println(STR." выносливость \{getStamina()} \{getName()}");
            } else if (Objects.equals(stamina, MIN_STAMINA)) {
                System.out.println(" пошел отдыхать");


            }

        }
    }


}
