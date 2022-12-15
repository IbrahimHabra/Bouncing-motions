package sample;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CanvasPlus extends Canvas {

    private final GraphicsContext graphicsContext = super.getGraphicsContext2D();
    private Color color;

    public CanvasPlus() {
        color = Color.BLACK;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public CanvasPlus(double width, double height) {
        super(width, height);
    }

    public void drawParticle(Partical partical){
        clear();
        graphicsContext.setFill(partical.getColor());
        graphicsContext.fillOval(partical.getPosition().getX()-partical.getRadius(),
                partical.getPosition().getY()-partical.getRadius(),
                2*partical.getRadius(),
                2*partical.getRadius()
        );
    }

    public void drawParticles(Partical... particles){
        clear();
        for(Partical p : particles) {
            graphicsContext.setFill(p.getColor());
            graphicsContext.fillOval(p.getPosition().getX()-p.getRadius(),
                    p.getPosition().getX()-p.getRadius(),
                    2*p.getRadius(),
                    2*p.getRadius()
            );
        }
    }

    public void drawBox(Box box){

    }

    private void clear(){
        graphicsContext.setFill(color);
        graphicsContext.fillRect(0,0,getWidth(),getHeight());
    }
}
