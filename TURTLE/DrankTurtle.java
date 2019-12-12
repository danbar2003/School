package TURTLE;

import unit4.turtleLib.Turtle;

import java.util.Random;


public class DrankTurtle extends Turtle{
    private Random rnd = new Random();

    public void moveForword(double steps){

        int step = (int)steps;
        steps = step - rnd.nextInt(step);
        double angle = rnd.nextInt(31)-30;
        for(int i = 0 ; i < steps/2; i ++) {
            this.setDelay(1000);
            if (i % 5 == 0)
                super.turnLeft(angle);
            super.moveForward(2);
        }
    }
}