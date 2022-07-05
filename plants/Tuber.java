package potatobeetlesapp.plants;

public class Tuber extends Plant {
    
    //Конструктор
    public Tuber(int number) {
        super();
        setImage("/potatobeetlesapp/pictures/tuber.png");
        setBounds(3 + 73 * (number % 100 % 10), 73 * (number % 100 / 10), 70, 70);
    }
    
    //Конструктор
    public Tuber(int number, int efficiency) {
        super();
        setImage("/potatobeetlesapp/pictures/tuber.png");
        setBounds(3 + 73 * (number % 100 % 10), 73 * (number % 100 / 10), 70, 70);
        treatTuber(efficiency);
    }

    @Override
    public Plant grow() {
        Sprout next = new Sprout(protection);
        next.setBounds(this.getBounds());
        if (isInfected()) {
            next.beetlesLeave(-this.getBeetlesNumber());
        }
        return next;
    }
    
    //Обработка клубня
    public final void treatTuber(int efficiency) {
        protection = (int)(Math.random() * 30 + Math.abs(efficiency - 30)) * 70 / 100;
    }

    @Override
    public void leavesGrow() {
        leaves = 0;
    }
}
