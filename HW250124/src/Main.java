import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<String> workers = new ArrayList<>(List.of("Jack:in", "John:in", "Jack:out", "Lena:in", "John:out"));

        Map<String, Integer> presentWorkersIn = workersIn(workers);

        List<String> result = workersInOffice(presentWorkersIn);

        System.out.println(result);


    }
    public static Map<String, Integer> workersIn(List<String> list) {
        Map<String, Integer> values = new HashMap<>();
        for (String str : list) {
            String[] parts = str.split(":");
            String worker = parts[0];
            String presence = parts[1];
            if (presence.contains("in")) {
                values.put(worker, values.getOrDefault(worker, 1));
            } else if(presence.contains("out")){
                values.put(worker, values.getOrDefault(worker, 0)-1);
            }
        }
        return values;
    }

    public static List<String> workersInOffice(Map<String, Integer> in) {
        List<String> result = new ArrayList<>();
        for(Map.Entry<String,Integer> entry: in.entrySet()){
            if(entry.getValue()>0){
                result.add(entry.getKey()+":in");
            }
        }
        return result;
    }

}

