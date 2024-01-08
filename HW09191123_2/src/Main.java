import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date dateNow = new LocalDate(2023, 11,19);
        dateNow.plusDays(1);
        System.out.println(dateNow.toString());
        Date today = new Date(2023, 11, 19);

    }
}