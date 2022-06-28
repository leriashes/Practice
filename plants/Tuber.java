package potatobeetlesapp.plants;

import potatobeetlesapp.plants.Plant;

public class Tuber extends Plant {
    public Tuber() {
        super();
        setIcon(new javax.swing.ImageIcon(getClass().getResource("/potatobeetlesapp/pictures/tuber.png")));
        setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setVerticalAlignment(javax.swing.SwingConstants.CENTER);
    }
}
