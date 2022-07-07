package potatobeetlesapp.plants;

public class Ripe extends Plant {
    
    public Ripe(int protection, int leaves) {
        super();
        setImage("/potatobeetlesapp/pictures/ripe.png");
        this.protection = protection;
        this.leaves = leaves;
    }
    
    @Override
    public Plant grow() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void leavesGrow() {
        leaves += (int)(Math.random() * 3) * 1000;
        leaves -= coloradoPotatoBeetles * 75 * 7;
        if (leaves <= 0) {
            die();
        }
    }
}
