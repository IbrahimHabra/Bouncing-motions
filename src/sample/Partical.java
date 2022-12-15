package sample;

import javafx.scene.paint.Color;

import static sample.Statics.WIDE;

public class Partical extends Drawn{


    private Vector2f position = new Vector2f();
    private Vector2f velocity = new Vector2f();
    private Vector2f acceleration = new Vector2f();
    private double radius;
    private Color color;



    public Partical(Vector2f position, Vector2f velocity, Vector2f acceleration, double radius) {
        this.position = position;
        this.velocity = velocity;
        this.acceleration = acceleration;
        this.radius = radius;
        color = Color.valueOf("#32d8c4");
    }

    public Partical(Vector2f position, Vector2f velocity, Vector2f acceleration) {
        this.position = position;
        this.velocity = velocity;
        this.acceleration = acceleration;
        color = Color.valueOf("#32d8c4");
    }

    public Partical() {
        setPosition(new Vector2f(10*WIDE,10*WIDE));
        setVelocity(new Vector2f(10*WIDE,-50*WIDE));
        setAcceleration(new Vector2f(0.0f*WIDE,0.0f*WIDE));
        setRadius(3 * WIDE);
        color = Color.valueOf("#32d8c4");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Vector2f getPosition() {
        return position;
    }

    public void setPosition(Vector2f position) {
        this.position = position;
    }

    public Vector2f getVelocity() {
        return velocity;
    }

    public void setVelocity(Vector2f velocity) {
        this.velocity = velocity;
    }

    public Vector2f getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(Vector2f acceleration) {
        this.acceleration = acceleration;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
