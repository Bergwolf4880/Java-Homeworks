import java.util.ArrayList;
import java.util.List;

public class TransformToList {

    public static List<Person> transformToList(List<String> stringList) {
        List<Person> people = new ArrayList<>();
        String[] parts = new String[2];

        for (String str : stringList) {
            parts = str.split(",");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            people.add(new Person(name,age));
        }
        return people;
    }

}
