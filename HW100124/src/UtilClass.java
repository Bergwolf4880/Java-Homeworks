import java.util.ArrayList;
import java.util.List;

public class UtilClass {

    public static void getMaxValue(List<Integer> numbers) {
        int maxNumber = Integer.MIN_VALUE;
        for (int temp : numbers) {
            if (temp > maxNumber) {
                maxNumber = temp;
            }
        }
        System.out.println("Maximum value: " + maxNumber);
    }

    public static void getMinValue(List<Integer> numbers) {
        int minNumber = Integer.MAX_VALUE;
        for (int temp : numbers) {
            if (temp < minNumber) {
                minNumber = temp;
            }
        }
        System.out.println("Minimum value: " + minNumber);
        ;
    }

    public static void getSum(List<Integer> numbers) {
        int sum = 0;
        for (int temp : numbers) {
            sum += temp;
        }
        System.out.println("Summary value: " + sum);
    }

    public static List<Integer> randomValueList() {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            temp.add(-100 + (int) (Math.random() * 100));
        }
        return temp;

    }
}
