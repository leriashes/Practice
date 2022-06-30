package potatobeetlesapp.plants;

public class Sprout extends Plant {
    public Sprout() {
        super();
        setImage("/potatobeetlesapp/pictures/sprout.png");
        //plant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/potatobeetlesapp/pictures/sprout.png")));
    }

    @Override
    public Plant grow() {
        Flowering next = new Flowering();
        next.setBounds(this.getBounds());
        if (isInfected()) {
            next.beetles();
        }
        return next;
    }

    @Override
    public Plant die() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
