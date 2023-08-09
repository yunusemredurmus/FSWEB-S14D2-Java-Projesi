package com.workintech.Room.Main;


import com.workintech.Room.RoomCreator.*;
import com.workintech.Room.enums.Direction;
import com.workintech.Room.enums.LampType;
import com.workintech.Room.enums.PaintColor;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Bedroom bedroom = new Bedroom("Tesbih",
                new Wall(Direction.NORTH),
                new Wall(Direction.EARTH),
                new Wall(Direction.WEST),
                new Wall(Direction.SOUTH), new Ceiling(250, PaintColor.GREEN),
                new Bed("Tek kişilik", 3, 2, 3, 1),
                new Lamp(LampType.BORDOUX, true, 8),
                new Carpet(10,20,PaintColor.RED),
                new Wardrobe(5,3,3.5));
        bedroom.getBed().make();
        bedroom.getCeiling().create();
        bedroom.getCarpet().lying();
        bedroom.getLamp().turnOn();

        System.out.println("Benim odam sihilir odam " + bedroom);
    }


}
