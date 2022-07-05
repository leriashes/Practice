package potatobeetlesapp.plants;

import potatobeetlesapp.TreatmentDrug;

public class Flowering extends Plant {

    public Flowering(int protection, int leaves) {
        super();
        setImage("/potatobeetlesapp/pictures/flowering.png");
        this.protection = protection;
        this.leaves = leaves;
    }
    
    @Override
    public Plant grow() {
        Ripe next = new Ripe(protection, leaves);
        next.setBounds(this.getBounds());
        if (isInfected()) {
            next.beetlesLeave(-this.getBeetlesNumber());
        }
        return next;
    }

    @Override
    public void leavesGrow() {
        leaves += (int)(Math.random() * 5) * 1000;
        leaves -= coloradoPotatoBeetles * 85 * 7;
        if (leaves <= 0) {
            die();
        }
    }
}
