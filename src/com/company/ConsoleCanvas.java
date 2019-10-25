package com.company;

public class ConsoleCanvas {
    private int xPos1;
    private int yPos1;
    private char[][] Canvas;

    public ConsoleCanvas(int xPos1, int yPos1) {

        this.xPos1 = x + 2;
        this.yPos1 = y + 2;

        Canvas = new char [x + 2][y + 2]

    }

    public static void main(String[] args) {
        ConsoleCanvas c = new ConsoleCanvas(10, 5);    // create a canvas
        c.showIt(4, 3, 'D');                                // add a Drone at 4,3
        System.out.println(c.toString());                // display result
    }
}
