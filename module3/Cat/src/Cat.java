
public class Cat
{
    static int count = 0;

    public static final int EYE_COUNT = 2;

    private static final double MIN_WEIGHT = 1000.0;
    private static final double MAX_WEIGHT = 9000.0;

    private double originWeight;
    private double weight;


    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count++;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            count--;
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
            count--;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public Double getEatingMass()
    {
        return weight - originWeight;
    }

    public void goToilet()
    {
        weight = weight - 2;
        System.out.println("Дело сделано!");
    }

    public static int getCount()
    {
        return count;
    }

    public void setCatColor(CatColor color)
    {

    }
}