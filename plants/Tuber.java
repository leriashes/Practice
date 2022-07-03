package potatobeetlesapp.plants;

public class Tuber extends Plant {
    private static int number = 0;
    
    public Tuber() {
        super();
        setImage("/potatobeetlesapp/pictures/tuber.png");
        setBounds(3 + 73 * (number % 100 % 10), 73 * (number % 100 / 10), 70, 70);
        number++;
    }

    @Override
    public Plant grow() {
        Sprout next = new Sprout();
        next.setBounds(this.getBounds());
        if (isInfected()) {
            next.beetlesCome(this.getBeetlesNumber());
        }
        return next;
    }
}
