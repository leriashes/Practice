package potatobeetlesapp;
import potatobeetlesapp.plants.*;

//Поле
public class Field extends javax.swing.JPanel {
    private int plantsNumber;       //Количество растений
    private int alivePlantsNumber;  //Количество живых растений
    private int infectPlantsNumber; //Количество растений с жуками
    private Plant[] plants;         //Растения
    
    private boolean collectingBugs; //Сбор жуков
    private TreatmentDrug drug;   //Препарат для обработки
    private int numTubersTreatment; //Количество обработанных клубней
    private int numPlantsTreatment; //Количество обработанных растений
    
    //Конструктор
    public Field() {
        initComponents();
        plantsNumber = 100;
        plants = new Plant[plantsNumber];
        
        collectingBugs = false;
        drug = new TreatmentDrug();
        numTubersTreatment = 0;
        numPlantsTreatment = 0;
        
        start();
    }
    
    //Старт (инициализация растений)
    public void start() {
        alivePlantsNumber = plantsNumber;
        infectPlantsNumber = 0;
        
        //Удаление старых растений при наличии
        for (int i = 0; i < plantsNumber; i++) {
            if (plants[i] != null) remove(plants[i]);
            plants[i] = null;
        }
        
        //Обработка клубней
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
        
        //Добавление необработанных клубней
        for (int i = 0; i < plantsNumber && numTubersTreatment != plantsNumber; i++) {
            if (plants[i] == null) {
                plants[i] = new Tuber(i);
            }
            add(plants[i]);
        }
        
        repaint();
    }
    
    //Количество растений
    public int getPlantsNumber() {
        return plantsNumber;
    }
    
    //Количество живых растений
    public int getAlivePlantsNumber() {
        return alivePlantsNumber;
    }
    
    //Количество заражённых растений
    public int getInfectedPlantsNumber() {
        return infectPlantsNumber;
    }
    
    //Установка параметров
    public void setProperties(int numTubers, int numPlants, int effTubersTreatment, int effPlantsTreatment, boolean collectingBugs) {
        numTubersTreatment = numTubers;
        numPlantsTreatment = numPlants;
        drug.setEffTubers(effTubersTreatment);
        drug.setEffPlants(effPlantsTreatment);
        this.collectingBugs = collectingBugs;
    }
    
    //Следующая неделя
    public void nextWeek(int numWeek) {
        boolean[] treatment = new boolean[plantsNumber];
        
        //Определение номеров растений для обработки ростков
        if (numWeek == 5) {
            
            for (int i = 0; i < plantsNumber; i++) {
                treatment[i] = false;
            }
            
            int j;
            for (int i = 0; i < numPlantsTreatment; i++) {
                j = (int)(Math.random() * plantsNumber);

                if (!treatment[j]) {
                    treatment[j] = true;
                }
                else {
                    i--;
                }
            }
        }
        
        //Выход жуков из земли
        if (numWeek == 1) {
            infectPlantsNumber = (int)(Math.random() * (plantsNumber / 2 + 1) + 1);
            
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
                
                int num = 0;
                
                //Обработка растений, рост, поедание жуками
                if (plants[i].isAlive()) {
                    
                    num = plants[i].getBeetlesNumber();
                    
                    if (numWeek == 5 && treatment[i]) {
                        plants[i].treatPlant(drug.getEffPlants());
                    }
                    
                    if (numWeek == 2 || numWeek == 6 || numWeek == 9) {    
                        remove(plants[i]);
                        plants[i] = plants[i].grow();
                        add(plants[i]);
                    }
                    else {
                        plants[i].leavesGrow();
                    }
                }
                
                //Размножение и переселение жуков
                if (plants[i].isAlive()) {
                    
                    //Суммирование жуков на сосдених растениях
                    switch (i % 10) {
                        //Первый столбец
                        case 0 -> {
                            bugs[i] = plants[i + 1].getBeetlesNumber();
                            
                            if (i != 0) {
                                bugs[i] += plants[i - 10].getBeetlesNumber() + plants[i - 9].getBeetlesNumber();
                            }   
                            
                            if (i != plantsNumber - 10) {
                                bugs[i] += plants[i + 10].getBeetlesNumber() + plants[i + 11].getBeetlesNumber();
                            }
                        }
                        //Последний столбец
                        case 9 -> {
                            bugs[i] = plants[i - 1].getBeetlesNumber();
                            if (i != 9) {
                                bugs[i] += plants[i - 10].getBeetlesNumber() + plants[i - 11].getBeetlesNumber();
                            }   
                            
                            if (i != plantsNumber - 1) {
                                bugs[i] += plants[i + 10].getBeetlesNumber() + plants[i + 9].getBeetlesNumber();
                            }
                        }
                        //Остальные столбцы
                        default -> {
                            bugs[i] = plants[i - 1].getBeetlesNumber() + plants[i + 1].getBeetlesNumber();
                            if (i > 10) {
                                bugs[i] += plants[i - 9].getBeetlesNumber() + plants[i - 10].getBeetlesNumber() + plants[i - 11].getBeetlesNumber();
                            }   
                            
                            if (i < plantsNumber - 10) {
                                bugs[i] += plants[i + 9].getBeetlesNumber() + plants[i + 10].getBeetlesNumber() + plants[i + 11].getBeetlesNumber();
                            }
                        }
                    }

                    bugs[i] = bugs[i] / 16 + plants[i].getBeetlesNumber() / 4;
                    
                    if (numWeek < 5) {
                        bugs[i] += (int)(Math.random() * 4);
                    }

                    if (plants[i].isInfected()) {
                        if (collectingBugs && numWeek % 2 == 0) {
                            bugs[i] -= (int)(Math.random() * 16 + 60) * plants[i].getBeetlesNumber() / 100 + (int)(Math.random() * 2);
                            i += 0;
                        }
                    }
                }
                else if (num > 0 && !plants[i].isAlive()) {
                    //Переселение жуков с погибшего растения
                    switch (i % 10) {
                        case 0 -> {
                            plants[i + 1].beetlesCome(num / 9);
                            if (i != 0) {
                                plants[i - 9].beetlesCome(num / 9);
                                plants[i - 10].beetlesCome(num / 9);
                            }   
                            
                            if (i != plantsNumber - 10) {
                                plants[i + 10].beetlesCome(num / 9);
                                plants[i + 11].beetlesCome(num / 9);
                            }
                        }
                        case 9 -> {
                            plants[i - 1].beetlesCome(num / 9);
                            if (i != 9) {
                                plants[i - 10].beetlesCome(num / 9);
                                plants[i - 11].beetlesCome(num / 9);
                            }   
                            
                            if (i != plantsNumber - 1) {
                                plants[i + 10].beetlesCome(num / 9);
                                plants[i + 9].beetlesCome(num / 9);
                            }
                        }
                        default -> {
                            plants[i - 1].beetlesCome(num / 9);
                            plants[i + 1].beetlesCome(num / 9);
                            
                            if (i > 10) {
                                plants[i - 9].beetlesCome(num / 9);
                                plants[i - 10].beetlesCome(num / 9);
                                plants[i - 11].beetlesCome(num / 9);
                            }   
                            
                            if (i < plantsNumber - 10) {
                                plants[i + 9].beetlesCome(num / 9);
                                plants[i + 10].beetlesCome(num / 9);
                                plants[i + 11].beetlesCome(num / 9);
                            }
                        }
                    }
                }
            }
            
            alivePlantsNumber = 0;
            
            //Переселение жуков, подсчёт категорий растений
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
                
                if (plants[i].isAlive()) {
                    alivePlantsNumber++;
                }
            }
        }
        
        repaint();
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
