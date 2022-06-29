package potatobeetlesapp.plants;

public class Sprout extends Plant {
    public Sprout() {
        super();
        setIcon(new javax.swing.ImageIcon(getClass().getResource("/potatobeetlesapp/pictures/sprout.png")));
    }

    @Override
    public Plant grow() {
        //if (isAlive())
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Plant die() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
