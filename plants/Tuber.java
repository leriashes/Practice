package potatobeetlesapp.plants;

public class Tuber extends Plant {
    private static int number = 0;
    
    public Tuber() {
        super();
        setIcon(new javax.swing.ImageIcon(getClass().getResource("/potatobeetlesapp/pictures/tuber.png")));
        setBounds(6 + 56 * (number % 130 % 13), 6 + 56 * (number % 130 / 13), 50, 50);
        setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        number++;
    }

    @Override
    public Plant grow() {
        Sprout next = new Sprout();
        next.setBounds(this.getBounds());
        next.setHorizontalAlignment(this.getHorizontalAlignment());
        next.setVerticalAlignment(this.getVerticalAlignment());
        return next;
    }

    @Override
    public Plant die() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
