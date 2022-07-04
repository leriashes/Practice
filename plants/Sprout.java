package potatobeetlesapp.plants;

//Росток
public class Sprout extends Plant {
    
    //Конструктор
    public Sprout(int protection) {
        super();
        setImage("/potatobeetlesapp/pictures/sprout.png");
        this.protection = protection;
    }

    @Override
    public Plant grow() {
        Flowering next = new Flowering(protection);
        next.setBounds(this.getBounds());
        
        if (isInfected()) {
            next.beetlesLeave(-this.getBeetlesNumber());
        }
        return next;
    }
}
