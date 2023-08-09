package com.workintech.Room.RoomCreator;

public class Wardrobe {
    private int width ;
    private int height ;
    private double weight;


    public Wardrobe(int width, int height, double weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public void add(){
        System.out.println("Wardrobe added into Bedroom.");


    }
}
