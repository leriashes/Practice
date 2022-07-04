package potatobeetlesapp.plants;

//Растение
public abstract class Plant extends javax.swing.JPanel {

    protected int leavesNumber; //Количество листьев
    protected int potatoNumber; //Количество плодов (картофелин)
    protected int ripeness;     //Зрелость
    protected boolean alive;    //Живое/неживое
    protected int coloradoPotatoBeetles;    //Количество жуков
    protected int protection;   //Защита от жуков
    
    //Конструктор
    public Plant() {
        initComponents();
        leavesNumber = 0;
        potatoNumber = 8;
        ripeness = 0;
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
    public void beetlesCome(int number) {
        
        if (coloradoPotatoBeetles > 20) {
            setBackground(new java.awt.Color(255, 255, 255));
            die();
        }
        else {
            coloradoPotatoBeetles += number * (100 - protection) / 100;
            color();
        }
        
        if (coloradoPotatoBeetles > 0)
            beetle.setVisible(true);
        
        jLabel1.setText(String.valueOf(coloradoPotatoBeetles));
    }
    
    //Установка цвета фона
    public void color() {
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
        coloradoPotatoBeetles -= number;
        
        if (coloradoPotatoBeetles <= 0) {
            coloradoPotatoBeetles = 0;
            beetle.setVisible(false);
        }
        else {
            beetle.setVisible(true);
        }
        
        color();
        jLabel1.setText(String.valueOf(coloradoPotatoBeetles));
    }
    
    //Количество плодов
    public int getPotatoNumber() {
        return potatoNumber;
    }
    
    //Количество жуков
    public int getBeetlesNumber() {
        return coloradoPotatoBeetles;
    }
    
    //Растение погибает
    public void die() {
        alive = false;
        coloradoPotatoBeetles = 0;
        //change picture
    }

    //Растение вырастает
    public abstract Plant grow();
    
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
        jLabel1 = new javax.swing.JLabel();

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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("0");
        add(jLabel1);
        jLabel1.setBounds(30, 10, 40, 17);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel beetle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel plant;
    // End of variables declaration//GEN-END:variables
}