package potatobeetlesapp.plants;

public abstract class Plant extends javax.swing.JPanel {

    protected int leavesNumber; //Количество листьев
    protected int potatoNumber; //Количество плодов (картофелин)
    protected int ripeness;     //Зрелость
    protected boolean alive;    //Живое/неживое
    protected int coloradoPotatoBeetles;
    
    //Конструктор
    public Plant() {
        initComponents();
        leavesNumber = 0;
        potatoNumber = 8;
        ripeness = 0;
        alive = true;
        coloradoPotatoBeetles = 0;
        
        beetle.setVisible(false);
    }

    protected void setImage(String address) {
        plant.setIcon(new javax.swing.ImageIcon(getClass().getResource(address)));
    }
    
    //Живо растение или нет
    public boolean isAlive() {
        return alive;
    }
    
    public boolean isInfected() {
        return (coloradoPotatoBeetles > 0);
    }
    
    public void beetlesCome(int number) {
        beetle.setVisible(true);
        coloradoPotatoBeetles += number;
        
        color();
    }
    
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
        else {
            setBackground(new java.awt.Color(255, 155, 102));
        }
    }
    
    public void beetlesLeave(int number) {
        coloradoPotatoBeetles -= number;
        
        if (coloradoPotatoBeetles <= 0) {
            coloradoPotatoBeetles = 0;
            beetle.setVisible(false);
            //setBackground(new java.awt.Color(147, 118, 89));
        }
        
        color();
    }
    
    //Количество плодов
    public int getPotatoNumber() {
        return potatoNumber;
    }
    
    public int getBeetlesNumber() {
        return coloradoPotatoBeetles;
    }
    
    public void die() {
        alive = false;
        //change picture
    }

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
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel beetle;
    private javax.swing.JLabel plant;
    // End of variables declaration//GEN-END:variables
}