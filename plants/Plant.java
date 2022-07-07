package potatobeetlesapp.plants;

//Растение
public abstract class Plant extends javax.swing.JPanel {

    protected int leaves; //Листья (вес в мг)
    protected boolean alive;    //Живое/неживое
    protected int coloradoPotatoBeetles;    //Количество жуков
    protected int protection;   //Защита от жуков
    
    //Конструктор
    public Plant() {
        initComponents();
        leaves = 0;
        alive = true;
        coloradoPotatoBeetles = 0;
        protection = 0;
        
        beetle.setVisible(false);
    }

    //Установка изображения
    protected void setImage(String address) {
        plant.setIcon(new javax.swing.ImageIcon(getClass().getResource(address)));
    }
    
    //Живо растение или нет
    public boolean isAlive() {
        return alive;
    }
    
    //Наличие жуков на растении
    public boolean isInfected() {
        return (coloradoPotatoBeetles > 0);
    }
    
    //Увеличение количества жуков
    public void beetlesCome(int numBeetles) {
        
        if (alive) {
            coloradoPotatoBeetles += numBeetles * (100 - protection) / 100;
            color();

            if (coloradoPotatoBeetles > 0)
                beetle.setVisible(true);

            numberLabel.setText(String.valueOf(coloradoPotatoBeetles));
        }
        
    }
    
    //Установка цвета фона
    private void color() {
        if (coloradoPotatoBeetles == 0) {
            setBackground(new java.awt.Color(147, 118, 89));
        }
        else if (coloradoPotatoBeetles < 5) {
            setBackground(new java.awt.Color(255, 255, 102));
        }
        else if (coloradoPotatoBeetles < 12) {
            setBackground(new java.awt.Color(255, 205, 102));
        }
        else if (coloradoPotatoBeetles < 20){
            setBackground(new java.awt.Color(255, 155, 102));
        }
        else {
            setBackground(new java.awt.Color(255, 105, 102));
        }
    }
    
    //Уменьшение количества жуков
    public void beetlesLeave(int number) {
        
        if (alive) {
            coloradoPotatoBeetles -= number;
        
            if (coloradoPotatoBeetles <= 0) {
                coloradoPotatoBeetles = 0;
                beetle.setVisible(false);
            }
            else {
                beetle.setVisible(true);
            }

            color();
            numberLabel.setText(String.valueOf(coloradoPotatoBeetles));
        }
    }
    
    //Количество жуков
    public int getBeetlesNumber() {
        return coloradoPotatoBeetles;
    }
    
    //Растение погибает
    protected void die() {
        alive = false;
        coloradoPotatoBeetles = 0;
        setBackground(new java.awt.Color(0, 0, 0));
        beetle.setVisible(false);
    }

    //Обработка растения
    public void treatPlant(int efficiency) {
        if (efficiency - 30 < 0) efficiency = 30;
        protection += (int)(Math.random() * 31 + efficiency - 30) * 30 / 100;
    }
    
    //Растение вырастает
    public abstract Plant grow();
    //Рост листьев
    public abstract void leavesGrow();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        beetle = new javax.swing.JLabel();
        plant = new javax.swing.JLabel();
        numberLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(147, 118, 89));
        setLayout(null);

        beetle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        beetle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/potatobeetlesapp/pictures/bug.png"))); // NOI18N
        add(beetle);
        beetle.setBounds(40, 30, 30, 40);

        plant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/potatobeetlesapp/pictures/sprout.png"))); // NOI18N
        plant.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        add(plant);
        plant.setBounds(0, 0, 60, 60);

        numberLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        numberLabel.setText("0");
        add(numberLabel);
        numberLabel.setBounds(30, 10, 40, 17);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel beetle;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JLabel plant;
    // End of variables declaration//GEN-END:variables
}