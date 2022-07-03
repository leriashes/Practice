package potatobeetlesapp;

//Препарат для обработки
public class TreatmentDrug {
    private int effTubers;  //Эффективность обработки клубней
    private int effPlants;  //Эффективность обработки растений
    
    //Конструктор
    public TreatmentDrug() {
        effTubers = 90;
        effPlants = 60;
    }
    
    //Эффективность обработки клубней
    public void setEffTubers(int value) {
        effTubers = value;
    }
    
    public int getEffTubers() {
        return effTubers;
    }
    
    //Эффективность обработки растений
    public void setEffPlants(int value) {
        effPlants = value;
    }
    
    public int getEffPlants() {
        return effPlants;
    }
}
