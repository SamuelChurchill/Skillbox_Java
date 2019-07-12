import java.util.Scanner;

public class Main
{
    private static int minIncome = 200000;// нижняя граница суммы доходов компании
    private static int maxIncome = 900000;// верхняя граница суммы доходов компании

    private static int officeRentCharge = 140000;// плата за аренду офиса
    private static int telephonyCharge = 12000;// плата за телефон
    private static int internetAccessCharge = 7200;// плата за интернет

    private static int assistantSalary = 45000;// зарплата помощника
    private static int financeManagerSalary = 90000;// зарплата ФИНАНСОВОГО менеджера

    private static double mainTaxPercent = 0.24;// процент налогов
    private static double managerPercent = 0.15;// процент менеджера

    private static double minInvestmentsAmount = 100000;// минимальная сумма для инвестиций

    public static void main(String[] args)
    {
        while(true)// начало бесконечного цикла
        {
            System.out.println("Введите сумму доходов компании за месяц " +
                "(от 200 до 900 тысяч рублей): ");// предложение ввести сумму
            int income = (new Scanner(System.in)).nextInt();// считывание введенной суммы

            if(!checkIncomeRange(income)) {// проверка введенной сумы на попадание в границы
                continue;
            }

            double managerSalary = income * managerPercent;// вычисление ЗП менеджера
            double pureIncome = income - managerSalary -
                calculateFixedCharges();// вычисление чистого дохода
            double taxAmount = mainTaxPercent * pureIncome;// вычисление налогов на чистую прибыль организации
            double pureIncomeAfterTax = pureIncome - taxAmount;// вычисление чистой прибыли после вычета налогов

            boolean canMakeInvestments = pureIncomeAfterTax >=
                minInvestmentsAmount;// выполнение проверки - может ли организация инвестировать

            double breakEvenPoint = calculateFixedCharges() + managerSalary + taxAmount;
            double investments = breakEvenPoint + minInvestmentsAmount;
            System.out.println("Точка безубыточности при тех же затратах: " + breakEvenPoint);
            System.out.println("Сумма дохода, с которой вы можете инвестировать при тех же затратах: " + investments);

            System.out.println("Зарплата менеджера: " + managerSalary);// вывод ЗП менеджера
            System.out.println("Общая сумма налогов: " +
                (taxAmount > 0 ? taxAmount : 0));// вывод суммы налогов
            System.out.println("Компания может инвестировать: " +
                (canMakeInvestments ? "да" : "нет"));// вывод возможность компании инвестровать
            if(pureIncome < 0) {// если чистая прибыль уходит в минус
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");// выводится сообщение о тревоге
            }
        }
    }

    private static boolean checkIncomeRange(int income)// проверка на попадание введенного дохода в заданные границы
    {
        if(income < minIncome)// не будет обработано так как доход меньше нижней границы
        {
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        if(income > maxIncome)// не будет обработано так как доход выше верхней границы
        {
            System.out.println("Доход выше верхней границы");
            return false;
        }
        return true;
    }

    private static int calculateFixedCharges()// вычисление общих затрат (аренда + абонентская плата
    //                                              +ЗП помощника и финансового менеджера)
    {
        return officeRentCharge +
                telephonyCharge +
                internetAccessCharge +
                assistantSalary +
                financeManagerSalary;
    }
}
