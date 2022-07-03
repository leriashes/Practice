package potatobeetlesapp.plants;

import potatobeetlesapp.TreatmentDrug;

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
    
    //Обработка растения
    public void plantTreatment(TreatmentDrug drug) {
        protection += (int)(Math.random() * drug.getEffPlants() + drug.getEffPlants() - 30) * 100 / 30;
    }
}
