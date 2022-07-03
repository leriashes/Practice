package potatobeetlesapp.plants;

//Росток
public class Sprout extends Plant {
    
    //Конструктор
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
