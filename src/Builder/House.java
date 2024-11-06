package Builder;

public class House {
    private int NumberOfFloor;
    private int NumberOfRoom;
    private boolean HasGarage;

    public House(Builder builder) {
        NumberOfFloor = builder.NumberOfFloor;
        NumberOfRoom = builder.NumberOfRoom;
        HasGarage = builder.HasGarage;

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
}
