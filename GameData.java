package org.example;


import org.example.data.Ball;
import org.example.data.Direction;
import org.example.data.Line;

import java.awt.*;

public class GameData {
    private Ball ball;
    private Line line;
    public void update() {
        ball.move(5, Direction.RIGHT);
        line.move(10, Direction.RIGHT);
    }

    public void initialize() {
        ball = new Ball(20,20,50,50, Color.RED);
        line = new Line(5, 120, 10,120, Color.BLUE);

    }

    public Ball getBall() {
        return ball;
    }

    public Line getLine() {
        return line;
    }
}
