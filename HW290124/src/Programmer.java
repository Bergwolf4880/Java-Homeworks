import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Programmer {

    private String name;
    private List<Task> list;
    private String city;

    public Programmer(String name, List<Task> list, String city) {
        this.name = name;
        this.list = list;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public List<Task> getList() {
        return list;
    }

    public String getCity() {
        return city;
    }

    public static Map<Task, List<Programmer>> getMapTaskProgrammer(List<Programmer> list) {
        Map<Task, List<Programmer>> task = new HashMap<>();

        for (Programmer programmer : list) {
            for (Task temp : programmer.getList()) {
                task.computeIfAbsent(temp, k -> new ArrayList<>()).add(programmer);

            }
        }
        return task;
    }


    public String oString() {
        return "Programmer{" + name + " " + city +
                " list= " + list;
    }
}
