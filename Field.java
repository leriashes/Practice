package potatobeetlesapp;
import potatobeetlesapp.plants.*;

//Поле
public class Field extends javax.swing.JPanel {
    private int plantsNumber;       //Количество растений
    private int alivePlantsNumber;  //Количество живых растений
    private int infectPlantsNumber; //Количество растений с жуками
    private int maxPotatoNumber;    //Максимальный урожай
    private int potatoNumber;       //Возможный урожай на текущий момент
    private Plant[] plants;         //Растения
    
    private boolean collectingBugs; //Сбор жуков
    protected TreatmentDrug drug;   //Препарат для обработки
    private int numTubersTreatment;
    private int numPlantsTreatment;
    
    //Конструктор
    public Field() {
        initComponents();
        plantsNumber = 100;
        plants = new Plant[plantsNumber];
        drug = new TreatmentDrug();
        numTubersTreatment = 0;
        numPlantsTreatment = 0;
        start();
    }
    
    //Старт (инициализация растений)
    private void start() {
        alivePlantsNumber = plantsNumber;
        infectPlantsNumber = 0;
        
        for (int i = 0; i < plantsNumber; i++) {
            plants[i] = null;
        }
        
        int j;
        for (int i = 0; i < numTubersTreatment; i++) {
            j = (int)(Math.random() * plantsNumber);
            
            if (plants[j] == null) {
                plants[j] = new Tuber(j, drug.getEffTubers());
            }
            else {
                i--;
            }
        }
        
        for (int i = 0; i < plantsNumber; i++) {
            if (plants[i] == null) {
                plants[i] = new Tuber(i);
            }
            add(plants[i]);
        }
        
        maxPotatoNumber = plantsNumber * 8;
        updateInfo();
    }
    
    //Заново
    public void restart() {
        for (int i = 0; i < plantsNumber; i++) {
            remove(plants[i]);
        }
        //repaint();
        start();
        repaint();
    }
    
    //Максимальное количество плодов
    public int getMaxPotatoNumber() {
        return maxPotatoNumber;
    }
    
    //Возможное количество плодов на текущий момент
    public int getPotatoNumber() {
        updateInfo();
        return potatoNumber;
    }
    
    //Количество растений
    public int getPlantsNumber() {
        updateInfo();
        return plantsNumber;
    }
    
    //Количество живых растений
    public int getAlivePlantsNumber() {
        updateInfo();
        return alivePlantsNumber;
    }
    
    //Количество заражённых растений
    public int getInfectedPlantsNumber() {
        return infectPlantsNumber;
    }
    
    //Следующая неделя
    public void nextWeek(int numWeek) {
        if (numWeek == 1) {
            infectPlantsNumber = (int)(Math.random() * (plantsNumber / 2) + 1);
            
            int j;
            for (int i = 0; i < infectPlantsNumber; i++) {
                j = (int)(Math.random() * plantsNumber);
                if (!plants[j].isInfected()) {
                    plants[j].beetlesCome((int)(Math.random() * 6 + 1));
                }
                else {
                    i--;
                }
            }
        } 
        else {
            infectPlantsNumber = 0;
            int[] bugs = new int[plantsNumber];
            
            for (int i = 0; i < plantsNumber; i++) {
                
                if(plants[i].isAlive()) {
                    if (numWeek == 2 || numWeek == 6 || numWeek == 9) {    
                        remove(plants[i]);
                        plants[i] = plants[i].grow();
                        add(plants[i]);
                    }
                    
                    switch (i % 10) {
                        case 0 -> {
                            bugs[i] = plants[i + 1].getBeetlesNumber();
                            if (i != 0) {
                                bugs[i] += plants[i - 10].getBeetlesNumber() + plants[i - 9].getBeetlesNumber();
                            }   if (i != plantsNumber - 10) {
                                bugs[i] += plants[i + 10].getBeetlesNumber() + plants[i + 11].getBeetlesNumber();
                            }
                        }
                        case 9 -> {
                            bugs[i] = plants[i - 1].getBeetlesNumber();
                            if (i != 9) {
                                bugs[i] += plants[i - 10].getBeetlesNumber() + plants[i - 11].getBeetlesNumber();
                            }   if (i != plantsNumber - 1) {
                                bugs[i] += plants[i + 10].getBeetlesNumber() + plants[i + 9].getBeetlesNumber();
                            }
                        }
                        default -> {
                            bugs[i] = plants[i - 1].getBeetlesNumber() + plants[i + 1].getBeetlesNumber();
                            if (i > 10) {
                                bugs[i] += plants[i - 9].getBeetlesNumber() + plants[i - 10].getBeetlesNumber() + plants[i - 11].getBeetlesNumber();
                            }   if (i < plantsNumber - 10) {
                                bugs[i] += plants[i + 9].getBeetlesNumber() + plants[i + 10].getBeetlesNumber() + plants[i + 11].getBeetlesNumber();
                            }
                        }
                    }

                    bugs[i] = bugs[i] / 16 + plants[i].getBeetlesNumber() / 4;
                    
                    if (numWeek < 5) {
                        bugs[i] += (int)(Math.random() * 4);
                    }

                    if (plants[i].isInfected()) {
                        if (collectingBugs) {
                            bugs[i] -= (int)(Math.random() * 31 + 70) * plants[i].getBeetlesNumber() / 100 + 1;
                            i += 0;
                        }
                    }
                }
            }
            
            for (int i = 0; i < plantsNumber; i++) {
                if (bugs[i] > 0) {
                    plants[i].beetlesCome(bugs[i]);
                }
                else if (bugs[i] < 0) {
                    plants[i].beetlesLeave(-bugs[i]);
                }
                
                if (plants[i].isInfected()) {
                    infectPlantsNumber += 1;
                }
            }
        }
        repaint();
    }
    
    //Обновление информации
    private void updateInfo() {
        potatoNumber = 0;
        alivePlantsNumber = 0;
        for (int i = 0; i < plantsNumber; i++) {
            if(plants[i].isAlive()) {
                alivePlantsNumber++;
                potatoNumber += plants[i].getPotatoNumber();
                //proverka na jukov
            }
        }
    }

    public void setProperties(int numTubers, int numPlants, int effTubersTreatment, int effPlantsTreatment, boolean collectingBugs) {
        numTubersTreatment = numTubers;
        numPlantsTreatment = numPlants;
        drug.setEffTubers(effTubersTreatment);
        drug.setEffPlants(effPlantsTreatment);
        this.collectingBugs = collectingBugs;
        //start();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(147, 118, 89));
        setFocusable(false);
        setLayout(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
