package core;

public class Car
{
    private String number;//             переменная String
    private int height;//                переменная int
    private double weight;//             переменная double
    private boolean hasVehicle;//        переменная boolean
    private boolean isSpecial;//         переменная boolean

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getNumber()
    {
        return number;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getHeight()
    {
        return height;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setHasVehicle(boolean vehicle)
    {
        this.hasVehicle = vehicle;
    }

    public boolean getHasVehicle()
    {
        return hasVehicle;
    }

    public void setSpecial(boolean special)
    {
        this.isSpecial = special;
    }

    public boolean getIsSpecial()
    {
        return isSpecial;
    }

    public String toString()
    {
        String special = getIsSpecial() ? "СПЕЦТРАНСПОРТ " : "";
        String vehicle = getHasVehicle() ? "Авто с прицепом ": "";
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + getNumber() +
            ":\n\tВысота: " + getHeight() + " мм\n\tМасса: " + getWeight() + " кг" + "\n" + vehicle;
    }
}