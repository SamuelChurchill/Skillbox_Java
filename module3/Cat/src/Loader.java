
public class Loader
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        Cat vaska = new Cat();
        Cat murzik = new Cat();
        Cat murka = new Cat();
        Cat ryzhik = new Cat();
        Cat masya = new Cat();

        while (cat.getWeight() > 1000.0)
        {
            System.out.print("Уличный кот: ");
            cat.meow();
        }
        System.out.println("Уличный кот " + cat.getWeight());
        System.out.println("Уличный кот " + cat.getStatus() + "\n");
        cat.feed(5000.0);
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
        ryzhik.goToilet();
        System.out.println("Рыжик " + ryzhik.getWeight());
        System.out.println("Рыжик " + ryzhik.getStatus() + "\n");

        System.out.println("Мася " + masya.getWeight());
        masya.feed(40.1234);
        System.out.println("Мася " + masya.getWeight());
        System.out.println("Мася съела " + masya.getEatingMass());
        masya.goToilet();
        System.out.println("Мася " + masya.getWeight() + "\n");

        System.out.println("Всего кошек " + Cat.getCount());
        System.out.println("Количество глаз у кошек " + Cat.EYE_COUNT);

        masya.setCatColor(CatColor.THREE_COLOR);
        vaska.setCatColor(CatColor.GREY);
        System.out.println("\nЦвет Маси " + masya.getCatColor());
        System.out.println("Цвет Васьки " + vaska.getCatColor());
        System.out.println("Цвет дворовой кошки " + cat.getCatColor());

        Cat kitty = new Cat(1100.0);
        System.out.println("\nКотенку задали вес при рождении: " + kitty.getWeight() + "\n");

        System.out.println("Всего кошек " + Cat.getCount());

        Cat mishka = vaska.catCopy();
        System.out.println("Мишка " + mishka.getWeight());
        System.out.println("Цвет Мишки " + mishka.getCatColor());
        System.out.println("Мишка " + mishka.getStatus());
        System.out.println("Мишка съел " + mishka.getEatingMass() + "\n");

        System.out.println("Всего кошек " + Cat.getCount() + "\n");

        System.out.println(newCat(5000.0).getWeight());
    }
    public static Cat newCat(double weight)
    {
        Cat changeCat = new Cat(weight);
        return changeCat;
    }
}