package com.company;

public class Drone {

    int xPos;
    int yPos;
    int iD;


    public Drone(int i, int j) {
        this.xPos = i;
        this.yPos = j;
    }

    public boolean isHere(int sx, int sy) {

        if (this.xPos == sx && this.yPos == sy) { //if drone we are looking at is in the set position
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Drone d = new Drone(5, 3);        // create drone
        System.out.println(d.toString());    // print where is
    }

    public String toString() {
        return "your drone is at " + this.xPos + "," + this.yPos;

    }

}

