import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> num1 = new ArrayList<>(List.of(1, 3, 4, 5, 6));
        List<Integer> num2 = new ArrayList<>(List.of(1, 3, 4, 6, 5));


        List<Boolean> result = listCompare(num1, num2);
        System.out.println(result);


    }

    public static List<Boolean> listCompare(List<Integer> num1, List<Integer> num2) {
        List <Boolean> result = new ArrayList<>();
        for (int i = 0; i < num1.size(); i++) {
            result.add(num1.get(i).equals(num2.get(i)));
        }
        return result;
    }


}