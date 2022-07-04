package potatobeetlesapp.plants;

import potatobeetlesapp.TreatmentDrug;

public class Flowering extends Plant {

    public Flowering(int protection) {
        super();
        setImage("/potatobeetlesapp/pictures/flowering.png");
        this.protection = protection;
    }
    
    @Override
    public Plant grow() {
        Ripe next = new Ripe(protection);
        next.setBounds(this.getBounds());
        if (isInfected()) {
            next.beetlesLeave(-this.getBeetlesNumber());
        }
        return next;
    }
}
