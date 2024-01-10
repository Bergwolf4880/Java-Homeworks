import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInputAndTest {


    public static List<Integer> userInputList() {
        List<Integer> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers to add: ");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            result.add(num);
        }
        System.out.println(result);
        return result;
    }
    public static List<Integer> getTestList(){
        List<Integer> constantNumbers = new ArrayList<>();

        constantNumbers.add(1);
        constantNumbers.add(7);
        constantNumbers.add(7);
        constantNumbers.add(2);
        constantNumbers.add(3);

        return constantNumbers;
    }
}
