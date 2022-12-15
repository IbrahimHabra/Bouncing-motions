package sample;

import java.util.List;

import static sample.Statics.WIDE;

public class PhysicsPar {
    private final float dt;
    private List<Partical> particles;
    private Partical partical;

    public PhysicsPar(float dt, Partical partical) {
        this.dt = dt;
        this.partical = partical;
    }

    public PhysicsPar(float dt, List<Partical> particles) {
        this.dt = dt;
        this.particles = particles;
    }

    public void doMaBoys(){
        for(Partical particle : particles) {
            particle.setVelocity(new Vector2f(
                    particle.getVelocity().getX() + particle.getAcceleration().getX()*dt,
                    particle.getVelocity().getY() + particle.getAcceleration().getY()*dt));
            particle.setPosition(new Vector2f(
                    particle.getPosition().getX() + particle.getVelocity().getX()*dt,
                    particle.getPosition().getY() + particle.getVelocity().getY()*dt));
            touchedEdge(particle);
        }
    }

    public void doMaBoy(){
            partical.setVelocity(new Vector2f(
                    partical.getVelocity().getX() + partical.getAcceleration().getX()*dt,
                    partical.getVelocity().getY() + partical.getAcceleration().getY()*dt));
            partical.setPosition(new Vector2f(
                    partical.getPosition().getX() + partical.getVelocity().getX()*dt,
                    partical.getPosition().getY() + partical.getVelocity().getY()*dt));
            touchedEdge(partical);
    }

    private void touchedEdge(Partical particle){
        if(touchPRL(particle)){
            particle.getVelocity().setX( particle.getVelocity().getX()*-1);
        }
        if(touchPUB(particle)){
            particle.getVelocity().setY( particle.getVelocity().getY()*-1);
        }
    }

    private boolean touchPRL(Partical particle){
        return 20 * WIDE <= particle.getPosition().getX() + particle.getRadius() ||
                0 >= particle.getPosition().getX() - particle.getRadius();
    }

    private boolean touchPUB(Partical particle){
        return 20 * WIDE <= particle.getPosition().getY() + particle.getRadius() ||
                0 >= particle.getPosition().getY() - particle.getRadius();
    }
}
