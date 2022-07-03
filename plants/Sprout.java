package potatobeetlesapp.plants;

public class Sprout extends Plant {
    public Sprout() {
        super();
        setImage("/potatobeetlesapp/pictures/sprout.png");
    }

    @Override
    public Plant grow() {
        Flowering next = new Flowering();
        next.setBounds(this.getBounds());
        if (isInfected()) {
            next.beetlesCome(this.getBeetlesNumber());
        }
        return next;
    }
}
