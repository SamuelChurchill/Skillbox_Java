
public class Loader
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        Cat vaska = new Cat();
        Cat murzik = new Cat();
        Cat murka = new Cat();
        Cat ryzhik = new Cat();

        for (; cat.getWeight() >= 0.0;)
        {
            System.out.print("Уличный кот: ");
            cat.meow();
        }
        System.out.println("Уличный кот " + cat.getWeight());
        System.out.println("Уличный кот " + cat.getStatus() + "\n");

        System.out.println("Васька " + vaska.getWeight());
        System.out.println("Васька " + vaska.getStatus());
        System.out.println("Кормим Ваську ");
        vaska.feed(2.0);
        System.out.println("Васька " + vaska.getWeight());
        System.out.println("Васька " + vaska.getStatus() + "\n");

        System.out.println("Мурзик " + murzik.getWeight());
        System.out.println("Мурзик " + murzik.getStatus());
        System.out.println("Поим Мурзика");
        murzik.drink(1.0);
        System.out.println("Мурзик " + murzik.getWeight());
        System.out.println("Мурзик " + murzik.getStatus() + "\n");

        System.out.println("Мурка " + murka.getWeight());
        System.out.println("Мурка " + murka.getStatus());
        System.out.print("Мурка: ");
        murka.meow();
        System.out.println("Мурка " + murka.getWeight());
        System.out.println("Мурка " + murka.getStatus() + "\n");

        System.out.println("Рыжик " + ryzhik.getWeight());
        System.out.println("Рыжик " + ryzhik.getStatus());
        System.out.println("Случайно высыпали всю коробку корма Рыжику и он все съел");
        ryzhik.feed(9000.0);
        System.out.println("Рыжик " + ryzhik.getWeight());
        System.out.println("Рыжик " + ryzhik.getStatus() + "\n");
    }
}