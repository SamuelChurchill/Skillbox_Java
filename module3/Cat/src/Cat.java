
public class Cat
{
    static int count = 0;

    public static final int EYE_COUNT = 2;

    private static final double MIN_WEIGHT = 1000.0;
    private static final double MAX_WEIGHT = 9000.0;

    private double originWeight;
    private double weight;
    private double feedAmount = 0.0;

    private boolean isAlive;

    private CatColor color = CatColor.UNKNOWN;

    public Cat()
    {
        this(1500.0 + 3000.0 * Math.random());
    }

    public Cat(double weight)
    {
        this.weight = weight;
        originWeight = this.weight;
        if (weight > MIN_WEIGHT && weight < MAX_WEIGHT)
        {
            count++;
            isAlive = true;
        }
    }

    public void meow()
    {
        if (!isAlive)
        {
            System.out.println("Ничего не происходит...");
        }
        else {
            weight--;
            System.out.println("Meow");
            if (isAlive && (weight < MIN_WEIGHT))
            {
                count--;
                isAlive = false;
            }
        }
    }

    public void feed(Double amount)
    {
        weight += amount;
        feedAmount += amount;
        if (isAlive && (weight > MAX_WEIGHT))
        {
            count--;
            isAlive = false;
        }
        else if (!isAlive && (weight > MIN_WEIGHT))
        {
            count++;
            isAlive = true;
            System.out.println("Произошло чудо, мы вернули кошку к жизни!");
        }
    }

    public void drink(Double amount)
    {
        weight += amount;
        feedAmount += amount;
        if (isAlive && (weight > MAX_WEIGHT))
        {
            count--;
            isAlive = false;
        }
        else if (!isAlive && (weight > MIN_WEIGHT))
        {
            count++;
            isAlive = true;
        }
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT)
        {
            return "Dead";
        }
        else if(weight > MAX_WEIGHT)
        {
            return "Exploded";
        }
        else if(weight > originWeight)
        {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public Double getEatingMass()
    {
        return feedAmount;
    }

    public void goToilet()
    {
        if (!isAlive)
        {
            System.out.println("Ничего не происходит...");
        }
        else {
            weight -= 2;
            System.out.println("Дело сделано!");
            if (isAlive && (weight < MIN_WEIGHT))
            {
                count--;
                isAlive = false;
            }
        }
    }

    public static int getCount()
    {
        return count;
    }

    public void setCatColor(CatColor color)
    {
        this.color = color;
    }

    public CatColor getCatColor()
    {
        return color;
    }

    public Cat catCopy()
    {
        Cat copyCat = new Cat();

        copyCat.color = getCatColor();
        copyCat.weight = getWeight();
        copyCat.originWeight = originWeight;
        copyCat.isAlive = isAlive;
        if (weight > MAX_WEIGHT || weight < MIN_WEIGHT)
        {
            count--;
        }
        copyCat.feedAmount = getEatingMass();
        return copyCat;
    }
}