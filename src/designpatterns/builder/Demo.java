package designpatterns.builder;

import designpatterns.builder.house.CivilEngineer;
import designpatterns.builder.house.House;
import designpatterns.builder.house.HouseBuilder;
import designpatterns.builder.house.IglooHouseBuilder;

public class Demo {
    public static void main(String[] args) {
        HouseBuilder iglooHouseBuilder = new IglooHouseBuilder();
        CivilEngineer civilEngineer = new CivilEngineer(iglooHouseBuilder);

        civilEngineer.constructHouse();
        House house = civilEngineer.getHouse();
        System.out.println("Builder constructed: " + house);
    }
}
