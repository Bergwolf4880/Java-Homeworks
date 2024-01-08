import java.util.Scanner;

public class InputOutputDates {

    public static MyDate getDateFromScanner() {
        Scanner scanner = new Scanner(System.in);
        MyDate date = new MyDate();

        System.out.println("Введите день: ");
        date.day = scanner.nextInt();

        System.out.println("Введите месяц: ");
        date.month = scanner.nextInt();

        System.out.println("Введите год: ");
        date.year = scanner.nextInt();

        return date;
    }

    public static void printComparingDates(MyDate date1, MyDate date2) {
        int result = MyDate.compareDates1(date1, date2);

        if (result == 0) {
            System.out.println("Первая датa: " + MyDate.dateToString(date1) + " вторая дата: " + MyDate.dateToString(date2) + " равны");
        } else {
            System.out.println("Первая датa: " + MyDate.dateToString(date1) + " вторая дата: " + MyDate.dateToString(date2));
            System.out.println(result > 0 ? "Первая дата позже" : "Вторая дата позже");
        }

    }

}
