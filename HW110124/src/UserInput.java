import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UserInput implements Comparator {

    private static List<Student> students = studentDatabase();
    private static int choise;

    private static List<Student> studentDatabase() {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Johan", 2, true));
        students.add(new Student("Pjotr", 5, false));
        students.add(new Student("Lena", 0, true));
        students.add(new Student("Mihail", 5, false));
        students.add(new Student("Varvara", 5, false));

        return students;
    }

    public static void chooseWayToSortInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, choose way to sort your list.");
        System.out.println("Choose 1 to sort by name length.\n" +
                            "Choose 2 to sort by amount of missed lessons.\n" +
                            "Choose 3 to sort if Jobcenter pays.\n"+
                            "Choose 4 to view original list.");

                            choise = scanner.nextInt();
    }

    public static void sortMethodChoise() {

        switch (choise) {
            case 1:
                Collections.sort(students, new LengthSort());
                break;
            case 2:
                Collections.sort(students, new MissedLessonsSort());
                break;
            case 3:
                Collections.sort(students, new JobcenterSort());
                break;
            case 4:
                break;
            default:

        }
        System.out.println(students);;
    }


}
