package potatobeetlesapp.plants;

public abstract class Plant extends javax.swing.JLabel {
    protected int leavesNumber; //Количество листьев
    protected int potatoNumber; //Количество плодов (картофелин)
    protected int ripeness;     //Зрелость
    protected boolean alive;    //Живое/неживое
    
    protected String pictureAddress;    //Адрес картинки
    
    //Конструктор
    public Plant() {
        leavesNumber = 0;
        potatoNumber = 8;
        ripeness = 0;
        alive = true;
    }
    
    //Живо растение или нет
    public boolean isAlive() {
        return alive;
    }
    
    //Количество плодов
    public int getPotatoNumber() {
        return potatoNumber;
    }

    public abstract Plant grow();
    public abstract Plant die();
}
