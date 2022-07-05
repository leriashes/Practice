package potatobeetlesapp.plants;

//Росток
public class Sprout extends Plant {
    
    //Конструктор
    public Sprout(int protection) {
        super();
        setImage("/potatobeetlesapp/pictures/sprout.png");
        this.protection = protection;
        leaves = 3000;
    }

    @Override
    public Plant grow() {
        Flowering next = new Flowering(protection, leaves);
        next.setBounds(this.getBounds());
        
        if (isInfected()) {
            next.beetlesLeave(-this.getBeetlesNumber());
        }
        return next;
    }

    @Override
    public void leavesGrow() {
        leaves += (int)(Math.random() * 5 + 2) * 1000;
        leaves -= coloradoPotatoBeetles * 75 * 7;
        if (leaves <= 0) {
            die();
        }
    }
}
