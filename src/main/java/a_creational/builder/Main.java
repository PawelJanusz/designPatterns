package a_creational.builder;


import a_creational.builder.house.House;

public class Main {

    public static void main(String[] args) {

        House smallHouse = new House.HouseBuilder()
                .buildWalls("20 walls")
                .buildFloors("10 floors")
                .buildDoors("5 doors")
                .buildRooms("5 rooms")
                .build();

        System.out.println("Small house: " + smallHouse);

        House bigHouse = new House.HouseBuilder()
                .buildWalls("30 walls")
                .buildFloors("30 floors")
                .buildDoors("10 doors")
                .buildRooms("10 rooms")
                .buildWindows("23 widows")
                .buildRoof("1 roof")
                .buildGarage("2 garage")
                .build();

        System.out.println("Big house: " + bigHouse);

    }

}
