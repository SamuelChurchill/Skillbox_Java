public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;

        System.out.println(container.count + "\n");

        System.out.println(sumDigits(444));
    }

    public static Integer sumDigits(Integer number)
    {
        int res = 0;
        String string = number.toString();
        for (int i = 0; i < string.length(); i++)
        {
            res += Character.getNumericValue(string.charAt(i));
        }
        return res;
    }


}
