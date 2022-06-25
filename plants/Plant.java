package potatobeetlesapp.plants;

public class Plant {
    private int leavesNumber;
    private int potatoNumber;
    private int ripeness;
    protected boolean alive;
    
    private String picture;
    
    public Plant() {
        ripeness = 5;
    }
    
    public boolean isAlive() {
        return alive;
    }
}
