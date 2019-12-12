package TURTLE;
import unit4.turtleLib.Turtle;

public class JumpyTurtle extends Turtle{
    public void moveForward(int steps){
        for(int i = 0; i < steps; i++){
            if (i % 10 == 0){
                this.tailDown();
                super.moveForward(10);
                this.tailUp();
                continue;
            }
            super.moveForward(1);
        }
    }
}

