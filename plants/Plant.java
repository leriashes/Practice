package potatobeetlesapp.plants;

public class Plant {
    protected int leavesNumber;
    protected int potatoNumber;
    protected int ripeness;
    protected boolean alive;
    
    protected String picture;
    
    public Plant() {
        leavesNumber = 0;
        potatoNumber = 8;
        ripeness = 0;
        alive = true;
    }
    
    public boolean isAlive() {
        return alive;
    }
    
    public int getPotatoNumber() {
        return potatoNumber;
    }
}
