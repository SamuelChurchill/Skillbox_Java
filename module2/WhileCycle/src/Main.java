import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int secretPinCode = 7567;
        int pinCode = -1;
        int tryCode = 3;

        Scanner scanner = new Scanner(System.in);
        while((pinCode != secretPinCode) && tryCode > 0)
        {
            if(pinCode == -1) {
                System.out.println("Введите пароль:");
            }
            else {
                tryCode--;
                System.out.println("Пароль введён неверно. Попыток осталось: " + tryCode + ". Введите верный пароль:");
            }
            pinCode = scanner.nextInt();
        }

        if(pinCode == secretPinCode) {
            System.out.println("Пароль введён верно!!!");
        }
        else {
            System.out.println("Доступ запрещен!!!");
        }
    }
}
