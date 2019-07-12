package core;

public class Car
{
    public String number;//             переменная String
    public int height;//                переменная int
    public double weight;//             переменная double
    public boolean hasVehicle;//        переменная boolean
    public boolean isSpecial;//         переменная boolean

    public String toString()
    {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        String vehicle = hasVehicle ? "Авто с прицепом ": "";
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг" + "\n" + vehicle;
    }
}