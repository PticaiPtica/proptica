package Builder;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<House> listHouse = new ArrayList<>();

        House house1 = new House.Builder().
                householder("John").
                numberOfRoom(2).
                numberOfFloor(2).
                hasGarage(true).
                build();


        House house2 = new House.Builder().
                householder("Vector").
                numberOfFloor(1).
                numberOfRoom(2).
                build();


        House house2_TestHasGarage = new House.Builder().
                householder("Vector").
                numberOfFloor(1).
                numberOfRoom(2).
                hasGarage(true).
                build();


        House house3 = new House.Builder().
                householder("Jane").
                numberOfFloor(3).
                numberOfRoom(5).
                hasGarage(true).
                build();


        House house4 = new House.Builder().
                householder("Bob").
                numberOfFloor(2).
                numberOfRoom(2).
                hasGarage(true).
                build();


        listHouse.add(house1);
        listHouse.add(house2);
        listHouse.add(house3);
        listHouse.add(house4);


        House testHouse = new House.Builder().
                householder("Test").
                numberOfFloor(2).
                numberOfRoom(2).
                hasGarage(true).
                build();


        System.out.println(listHouse);

        System.out.println("Есть ли дом " + house1.getHouseholder() + " в списке " + listHouse.contains(house1));
        System.out.println("Есть ли дом " + house3.getHouseholder() + " в списке " + listHouse.contains(house3));

        System.out.println("Есть ли дом " + testHouse.getHouseholder() + " в списке " + listHouse.contains(testHouse));

        System.out.println("Сравнение дома  " + house2_TestHasGarage.getHouseholder() +
                " с Гаражом ,с домом " + house2.getHouseholder() + " без гаража " + house2_TestHasGarage.testEquals(house2));


        System.out.println("Индекс дома " + house2.getHouseholder() + " " + listHouse.indexOf(house2));
        System.out.println("Индекс дома " + house4.getHouseholder() + " " + listHouse.indexOf(house4));

        System.out.println("Индекс дома " + testHouse.getHouseholder() + " " + listHouse.indexOf(testHouse));



    }
}
