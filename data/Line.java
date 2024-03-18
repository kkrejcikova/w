package org.example.data;

import java.awt.*;

public class Line {
    private int x;
    private int y;
    private int x2;
    private int y2;
    private Color color;

    public Line(int x, int y, int x2, int y2, Color color) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    public void move(int steps, Direction direction){
        switch (direction){
            case UP -> {
                y -= steps;
            }
            case DOWN -> {
                y += steps;
            }
            case LEFT -> {
                x -= steps;
            }
            case RIGHT -> {
                x += steps;
            }
        }
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
}
