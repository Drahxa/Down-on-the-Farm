public class Cow {

    //INSTANCE VARIABLE
    private String name;
    private double weight;
    private int age;
    private boolean gender;



    //CONTRUCTORS

    public Cow(){
        this.name = "Unknown";
        this.weight = 0;
        this. age = 0;
        this.gender = false;
    }
    public Cow(String name, double weight, int age, boolean gender){
        this.name = name;
        this.weight = weight;
        this. age = age;
        this.gender = gender;
    }


    //METHODS
    public void makeNoise(){
        System.out.println("MoooMooo");
    }
    public void haveBirthday(){
        this.age ++;
    }
    public void displayCow(){
        System.out.println("Name:" + name + " Weight:" + weight + " Age:" + age + " Gender:" + gender);
    }

}
