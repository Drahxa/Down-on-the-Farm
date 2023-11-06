public class Pig 
{

    //INSTANCE VARIABLE
    private String color;
    private double weight;
    private int penSize;
    private boolean wallowed;



    //CONTRUCTORS
    public Pig(){
        this.color = "Unknown";
        this.weight = 0;
        this.penSize = 0;
        this.wallowed = false;
    }
    public Pig(String color, double weight, int penSize, boolean wallowed){
        this.color = color;
        this.weight = weight;
        this.penSize = penSize;
        this.wallowed = wallowed;
    }


    //METHODS
    public void makeNoise(){
        System.out.println("CocoroCO");
    }
    public void upgradePenSize(int amount){
        this.penSize += amount;
    }
    public void displayCow(){
        System.out.println("Color:" + color + "\nWeight:" + weight + "\nPen Size:" + penSize + "\nwallowed in mud:" + wallowed);
    }

}
