import java.util.Scanner;

public class Rubl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double initialaccount = 100; // на счете денег изначально
        System.out.println("Введите сумму пополнения");
        double depositamount = scanner.nextDouble(); // Сумма пополнения
        if (depositamount >= 1000) {
            double bonus = depositamount / 100; // Бонус
            double finalamount = depositamount + bonus + initialaccount; // Финальная сумма
            System.out.println(finalamount + " Денег на счете");
            System.out.println(bonus + "Бонус");
        } else {
            double finalamountwithoutbonus = initialaccount + depositamount;// без бонуса
            System.out.println(finalamountwithoutbonus + " Денег на счете");
        }
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
