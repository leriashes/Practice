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
    
    //Обработка растения
    public void plantTreatment(TreatmentDrug drug) {
        protection += (int)(Math.random() * 30 + Math.abs(drug.getEffPlants() - 30)) * 100 / 30;
    }
}
