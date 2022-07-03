package potatobeetlesapp.plants;

//Клубень
import potatobeetlesapp.TreatmentDrug;

public class Tuber extends Plant {
    private static int number = 0; //Номер
    
    //Конструктор
    public Tuber() {
        super();
        setImage("/potatobeetlesapp/pictures/tuber.png");
        setBounds(3 + 73 * (number % 100 % 10), 73 * (number % 100 / 10), 70, 70);
        number++;
    }
    
    //Конструктор
    public Tuber(int efficiency) {
        super();
        setImage("/potatobeetlesapp/pictures/tuber.png");
        setBounds(3 + 73 * (number % 100 % 10), 73 * (number % 100 / 10), 70, 70);
        tuberTreatment(efficiency);
        number++;
    }

    @Override
    public Plant grow() {
        Sprout next = new Sprout();
        next.setBounds(this.getBounds());
        if (isInfected()) {
            next.beetlesCome(this.getBeetlesNumber());
        }
        number--;
        return next;
    }
    
    //Обработка клубня
    public final void tuberTreatment(int efficiency) {
        protection = (int)(Math.random() * efficiency + efficiency - 30) * 100 / 70;
    }
}
