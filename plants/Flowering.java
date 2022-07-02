package potatobeetlesapp.plants;

public class Flowering extends Plant {

    public Flowering() {
        super();
        setImage("/potatobeetlesapp/pictures/flowering.png");
    }
    
    @Override
    public Plant grow() {
        Ripe next = new Ripe();
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
