public class MyDate {
    int day;
    int month;
    int year;

    public static String dateToString(MyDate date) {
        return date.day + "-" + date.month + "-" + date.year;
    }

    public static int compareDates1(MyDate date1, MyDate date2) {
        if (date1.year != date2.year) {
            return date1.year - date2.year;
        } else if (date1.month != date2.month) {
            return date1.month - date2.month;
        } else return date1.day - date2.day;
    }

}

