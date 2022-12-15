package sample;

import static sample.Statics.WIDE;

public class Vector2f {
    private float x,y;

    public Vector2f() {
    }

    public float getX() {
        return x/WIDE;
    }

    public void setX(float x) {
        this.x = x*WIDE;
    }

    public float getY() {
        return y/WIDE;
    }

    public void setY(float y) {
        this.y = y*WIDE;
    }

    public Vector2f(float x, float y) {
        this.x = x*WIDE;
        this.y = y*WIDE;
    }
}
