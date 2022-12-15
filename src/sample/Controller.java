package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.Initializable;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

import static sample.Statics.FPS;

public class Controller implements Initializable {
    public CanvasPlus canvas;
    private final Partical particle = new Partical();
    private PhysicsPar pp;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        particle.setVelocity(new Vector2f(10,30));
        update(1.0f/FPS);

    }

    public void update(float dt){
        pp = new PhysicsPar(dt,particle);
        Timeline tl = new Timeline();
        tl.getKeyFrames().add(
                new KeyFrame(Duration.seconds(dt), e -> {
                    pp.doMaBoy();
                    canvas.drawParticle(particle);
                }));
        tl.setCycleCount(Timeline.INDEFINITE);
        tl.play();
    }


}
