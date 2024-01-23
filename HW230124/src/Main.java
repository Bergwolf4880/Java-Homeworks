import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> exampleMap = new HashMap<>();
        exampleMap.put("add1", 2);
        exampleMap.put("add2", 3);
        exampleMap.put("add3", 4);
        exampleMap.put("add4", 5);

        System.out.println(exampleMap);
        sumValues(exampleMap, "add1", "add2");
        System.out.println(exampleMap);

        List<String> list = new ArrayList<>(
                List.of("Bob", "Bob", "Bob", "Bill"));

        Map<String, Integer> keysAmountToValue =stringAmountValue(list);
        System.out.println(keysAmountToValue);
    }

    public static void sumValues(Map<String, Integer> exampleMap, String key1, String key2) {
        int sum = exampleMap.get(key1) + exampleMap.get(key2);
        exampleMap.put("summ", sum);
    }

    public static Map<String, Integer> stringAmountValue(List<String> list) {
        Map<String, Integer> temp = new HashMap<>();

        for (String str : list) {
            temp.put(str, temp.getOrDefault(str,0)+1);
        }
        return temp;
    }

}
