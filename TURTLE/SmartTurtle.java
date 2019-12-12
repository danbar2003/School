package TURTLE;

public class SmartTurtle extends unit4.turtleLib.Turtle {

    public void drawSquare(double squreSize) {
        double xCordinate = this.getXLocation();
        double yCordinate = this.getYLocation();
        double angle = this.getHeading();
        this.turnRight(angle);
        this.moveForward(squreSize / 2);

        for (int i = 0; i < 5; i++) {
            this.setDelay(1000);
            if (i == 0 || i == 4) {
                this.turnRight(90);
                this.tailDown();
                this.moveForward(squreSize / 2);
            } else {
                this.turnRight(90);
                this.tailDown();
                this.moveForward(squreSize);
            }
        }
        this.tailUp();
        this.turnRight(90);
        this.moveForward(squreSize / 2);
        this.turnLeft(180 + angle);
    }

    public void moveTo(double x, double y) {
        if (x > this.getXLocation())
            this.turnLeft(270 - this.getHeading() - Math.toDegrees(Math.atan((y - this.getYLocation()) / (x - this.getXLocation()))));
        else
            this.turnLeft(90 - this.getHeading() - Math.toDegrees(Math.atan((y - this.getYLocation()) / (x - this.getXLocation()))));
        this.moveForward(Math.sqrt(Math.pow(x - this.getXLocation(), 2) + Math.pow(y - this.getYLocation(), 2)));
    }

    public void drawNangle(int n, double nAngleSize) {
        double angle = 270 - 180.0 / n;
        this.turnRight(this.getHeading());
        for (int i = 0; i < n; i++) {
            this.setDelay(10);
            if (i == 0) {
                this.turnRight(angle);
                this.tailDown();
                this.moveForward(nAngleSize);
            } else {
                this.turnRight(180 - 2 * angle);
                this.tailDown();
                this.moveForward(nAngleSize);
            }
        }
    }

    public void mechlaMechuklal(int n, double radius) {
        this.moveForward(radius);
        this.drawNangle(n, Math.sqrt(2 * Math.pow(radius, 2) - 2 * Math.pow(radius, 2) * Math.cos(Math.toDegrees(2 * Math.PI * radius * n / 360))));

    }
}
