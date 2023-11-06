public class Main {
    public static void main(String[] args)
    {
        Cow franny = new Cow();
        Cow gretta = new Cow("Gretta", 100, 1, false);
        
        Chicken clucky = new Chicken();
        Chicken marshmallow = new Chicken("Sussex", 83.5, 2, false);
        
        Pig piglet = new Pig();
        Pig pickles = new Pig("Yellow", 567.88, 10, true);

        franny.makeNoise();
        clucky.makeNoise();
        pickles.makeNoise();
        gretta.haveBirthday();
        marshmallow.eatFood(10);
        piglet.upgradePenSize(3);

    }

}
