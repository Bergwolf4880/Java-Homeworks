import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>(List.of(
                new Person("Bill", 30),
                new Person("Robert", 30),
                new Person("Jack", 29),
                new Person("Jill", 29),
                new Person("Jamie", 25),
                new Person("Johnie", 31)
        ));

        Map<Person, String> namesMapped = convertListToMap(list);
        System.out.println(namesMapped);

        Map<Integer, List<Person>> map = addByAge(list);
        System.out.println(map);

    }


    public static Map<Person, String> convertListToMap(List<Person> list) {
        Map<Person, String> temp = new HashMap<>();
        for (Person person : list) {
            temp.put(person, person.getName());
        }
        return temp;
    }

    public static Map<Integer, List<Person>> addByAge(List<Person> list) {
        Map<Integer, List<Person>> temp = new HashMap<>();
        List<Person> people = new ArrayList<>();
        for (Person person : list) {
            temp.computeIfAbsent(person.getAge(), (Integer k) -> people).add(person);
        }
        return temp;
    }
}



