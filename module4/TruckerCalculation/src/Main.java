import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int MAX_TRUCK_VOLUME = 12;
        int MAX_CONTAINER_VOLUME = 27;
        int MIN_CONTAINER_VOLUME = 1;
        int MIN_TRUCK_VOLUME = 1;

        int containerCount = 0;
        int truckCount = 0;
        int ostTruck = 1;
        int ostContainer = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество коробок: ");
        int box = scanner.nextInt();
        System.out.println("Введите объем контейнера (больше 1 и не больше 27): ");
        int containerVolume = scanner.nextInt();

        if(containerVolume > MAX_CONTAINER_VOLUME)
        {
            System.out.println("Значение больше 27, соответсвенно объем контейнера автоматически стал равен 27");
            containerVolume = MAX_CONTAINER_VOLUME;
        }
        else if (containerVolume < MIN_CONTAINER_VOLUME)
        {
            System.out.println("Значение меньше 1, соответсвенно объем контейнера автоматически стал равен 1");
            containerVolume = MIN_CONTAINER_VOLUME;
        }
        System.out.println("Введите объем грузовика (больше 1 и не больше 12): ");
        int truckVolume = scanner.nextInt();
        if (truckVolume > MAX_TRUCK_VOLUME)
        {
            System.out.println("Значение больше 12, соответсвенно объем грузовика автоматически стал равен 12");
            truckVolume = MAX_TRUCK_VOLUME;
        }
        else if (truckVolume < MIN_TRUCK_VOLUME)
        {
            System.out.println("Значение меньше 1, соответсвенно объем грузовика автоматически стал равен 1");
            truckVolume = MIN_TRUCK_VOLUME;
        }

        if (truckVolume == 1)
        {
            ostTruck = 0;
        }
        if (containerVolume == 1)
        {
            ostContainer = 0;
        }

        while (box > 0)
        {
            for(int i = 1; i <= box; i++) {
                if ((i % containerVolume) == ostContainer)
                {
                    containerCount++;
                    if ((containerCount % truckVolume) == ostTruck)
                    {
                        truckCount++;
                        System.out.println(truckCount + " truck");
                    }
                    System.out.println("\t" + containerCount + " container");
                }
                System.out.println("\t\t" + i + " box");
                if(i == box)
                {
                    box -= i;
                }
            }
        }

        System.out.println("\nВсего грузовиков: " + truckCount);
        System.out.println("Всего контейнеров: " + containerCount);
    }
}
