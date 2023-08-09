package com.workintech.Room.RoomCreator;

import com.workintech.Room.enums.Direction;

public class Wall {
    private Direction direction;

    public Wall(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public void create() {
        System.out.println("Direction is creating" + direction);

    }

    @Override
    public String toString() {
        return "Wall{" +
                "direction=" + direction +
                '}';
    }


}
