package a_creational.builder;


import a_creational.builder.house.House;

public class Main {

    public static void main(String[] args) {

        House house = new House.HouseBuilder()
                .buildWalls("20 walls")
                .buildFloors("10 floors")
                .buildDoors("5 doors")
                .buildRooms("5 rooms")
                .build();

        System.out.println(house);
    }

}
