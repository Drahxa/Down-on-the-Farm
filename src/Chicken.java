public class Chicken {

    //INSTANCE VARIABLE
    private String breed;
    private double weight;
    private int egg;
    private boolean mean;



    //CONTRUCTORS

    public Chicken(){
        this.breed = "Unknown";
        this.weight = 0;
        this.egg = 0;
        this.mean = false;
    }
    public Chicken(String breed, double weight, int egg, boolean mean){
        this.breed = breed;
        this.weight = weight;
        this.egg = egg;
        this.mean = mean;
    }


    //METHODS
    public void makeNoise(){
        System.out.println("CocoroCO");
    }
    public void eatFood(int amount){
        this.weight += amount;
    }
    public void displayChicken(){
        System.out.println("Breed:" + breed + "\nWeight:" + weight + "\nEggs:" + egg + "\nMean:" + mean);
    }

}
