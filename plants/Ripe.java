package potatobeetlesapp.plants;

public class Ripe extends Plant {
    
    public Ripe(int protection) {
        super();
        setImage("/potatobeetlesapp/pictures/ripe.png");
        this.protection = protection;
    }
    
    @Override
    public Plant grow() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //появление картошки метод
}
