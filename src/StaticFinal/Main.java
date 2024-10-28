package StaticFinal;

public class Main {
    public static void main(String[] args) {
        Player playersFootBall1 = new Player("Игрок № 1");
        playersFootBall1.info();
        Player playersFootBall2 = new Player("Игрок № 2");
        playersFootBall2.info();
        Player playersFootBall3 = new Player("Игрок № 3");
        playersFootBall3.info();
        Player playersFootBall4 = new Player("Игрок № 4");
        playersFootBall4.info();
        Player playersFootBall5 = new Player("Игрок № 5");
        playersFootBall5.info();
        Player playersFootBall6 = new Player("Игрок № 6");
        playersFootBall6.info();
        Player test = new Player("Test");

        test.info();

        for (int i = playersFootBall1.getStamina(); i > Player.MIN_STAMINA; ) {
            i = playersFootBall1.getStamina();
            playersFootBall1.run();

        }


    }
}

