package potatobeetlesapp;

public class TreatmentDrug {
    private int effTubers;
    private int effPlants;
    
    public TreatmentDrug() {
        effTubers = 90;
        effPlants = 60;
    }
    
    public void SetEffTubers(int value) {
        effTubers = value;
    }
    
    public void SetEffPlants(int value) {
        effPlants = value;
    }
}
