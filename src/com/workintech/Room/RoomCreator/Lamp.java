package com.workintech.Room.RoomCreator;

import com.workintech.Room.enums.LampType;
import org.w3c.dom.ls.LSOutput;

public class Lamp {
    private LampType style;
    private boolean battery;
    private int globRating ;

    public Lamp(LampType style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

public void turnOn () {
    System.out.println("Lamp is being turned on.");
}

    public LampType getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "style=" + style +
                ", battery=" + battery +
                ", globRating=" + globRating +
                '}';
    }
}

