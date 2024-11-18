package Builder;

import java.util.Objects;

public class House {
    private int NumberOfFloor;
    private int NumberOfRoom;
    private boolean HasGarage;
    private String Householder;

    public House(Builder builder) {
        NumberOfFloor = builder.NumberOfFloor;
        NumberOfRoom = builder.NumberOfRoom;
        HasGarage = builder.HasGarage;
        Householder = builder.Householder;

    }

    public String getHouseholder() {
        return Householder;
    }

    public int getNumberOfFloor() {
        return NumberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        NumberOfFloor = numberOfFloor;
    }

    public int getNumberOfRoom() {
        return NumberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        NumberOfRoom = numberOfRoom;
    }

    public boolean isHasGarage() {
        return HasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        HasGarage = hasGarage;
    }

    public void infoHouse() {
        if (isHasGarage()) {
            System.out.println(STR."В доме \{getNumberOfFloor()} этажа,\{getNumberOfRoom()} комнат, гараж");
        } else {
            System.out.println(STR."В доме \{getNumberOfFloor()} этажа,\{getNumberOfRoom()} комнат");
        }
    }

    public static class Builder {
        public String Householder;
        private int NumberOfFloor;
        private int NumberOfRoom;
        private boolean HasGarage;

        public Builder() {

        }

        /**
         * Количество этажей
         * @param numberOfFloor
         */
        public Builder numberOfFloor(int numberOfFloor) {
            NumberOfFloor = numberOfFloor;
            return this;
        }

        /**
         * Количество комнат
         * @param numberOfRoom
         */
        public Builder numberOfRoom(int numberOfRoom) {
            NumberOfRoom = numberOfRoom;
            return this;
        }

        /**
         * Имя хозяина Дома
         * @param householder
         */
        public Builder householder(String householder) {
            Householder = householder;
            return this;
        }

        /**
         * Имеется ли гараж
         * @param hasGarage
         */
        public Builder hasGarage(boolean hasGarage) {
            HasGarage = hasGarage;
            return this;
        }

        public House build() {
            return new House(this);
        }

    }

    @Override
    public String toString() {
        if (isHasGarage()) {
            return "Дом " + Householder + " имеет " +
                    NumberOfFloor + " Этажей, " +
                    NumberOfRoom + " комнат " +
                    " и гараж";
        } else {
            return "Дом " + Householder + " имеет " +
                    NumberOfFloor + " Этажей, " +
                    NumberOfRoom + " комнат ";
        }

    }


    public boolean testEquals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return NumberOfFloor == house.NumberOfFloor && NumberOfRoom == house.NumberOfRoom && Objects.equals(Householder, house.Householder);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return NumberOfFloor == house.NumberOfFloor && NumberOfRoom == house.NumberOfRoom && HasGarage == house.HasGarage && Objects.equals(Householder, house.Householder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NumberOfFloor, NumberOfRoom, HasGarage, Householder);
    }


}
