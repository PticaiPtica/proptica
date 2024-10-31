package Builder;

public class Main {
    public static void main(String[] args) {


        House house1 = new House.Builder().
                numberOfRoom(2).
                numberOfFloor(2).
                hasGarage(true).
                build();
        house1.infoHouse();

        House house2 = new House.Builder().
                numberOfFloor(1).
                numberOfRoom(2).
                build();
        house2.infoHouse();
    }
}
