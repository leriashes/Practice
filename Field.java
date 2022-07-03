package potatobeetlesapp;
import potatobeetlesapp.plants.*;

public class Field extends javax.swing.JPanel {
    private int plantsNumber;   //Количество растений
    private int alivePlantsNumber;  //Количество живых растений
    private int infectPlantsNumber; //Количество растений с жуками
    private int maxPotatoNumber;    //Максимальный урожай
    private int potatoNumber;   //Возможный урожай на текущий момент
    private Plant[] plants; //Растения
    
    private boolean collectingBugs;
    
    //Конструктор
    public Field() {
        initComponents();
        plantsNumber = 100;
        plants = new Plant[plantsNumber];
        start();
    }
    
    private void start() {
        alivePlantsNumber = plantsNumber;
        infectPlantsNumber = 0;
        
        for (int i = 0; i < plantsNumber; i++) {
            plants[i] = new Tuber();
            add(plants[i]);
        }
        
        maxPotatoNumber = plantsNumber * 8;
        updateInfo();
    }
    
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
    
    public int getInfectedPlantsNumber() {
        return infectPlantsNumber;
    }
    
    public void nextWeek(int numWeek) {
        if (numWeek == 1) {
            infectPlantsNumber = (int)(Math.random() * 50 + 1);
            
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
            for (int i =0; i < plantsNumber; i++) {
            if (numWeek == 2 || numWeek == 6 || numWeek == 9) {    
                remove(plants[i]);
                plants[i] = plants[i].grow();
                add(plants[i]);
            }
            
            if (plants[i].isInfected()) {
                if (collectingBugs) {
                    plants[i].beetlesLeave((int)(Math.random() * 100 + 60) * plants[i].getBeetlesNumber() / 100);
                }
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

    public void setCollectingBugs(boolean value) {
        collectingBugs = value;
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
