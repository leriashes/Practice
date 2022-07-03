package potatobeetlesapp.plants;

public class Flowering extends Plant {

    public Flowering() {
        super();
        setImage("/potatobeetlesapp/pictures/flowering.png");
    }
    
    @Override
    public Plant grow() {
        Ripe next = new Ripe();
        next.setBounds(this.getBounds());
        if (isInfected()) {
            next.beetlesCome(this.getBeetlesNumber());
        }
        return next;
    }
}
