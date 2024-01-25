import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Person> list2 = new ArrayList<>(List.of(
                new Person("Bill", 30),
                new Person("Robert", 30),
                new Person("Jack", 29),
                new Person("Jill", 29),
                new Person("Jamie", 25),
                new Person("Johnie", 31)
        ));

        compare(list2);

    }
    public static void compare(List<Person> list2) {
        list2.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println("Sort names alphabetically: " + list2);

        list2.sort((p1, p2) -> (Integer.compare(p1.getName().length(), p2.getName().length())));
        System.out.println("Sort by name length: " + list2);

        list2.sort((p1, p2) -> p1.getAge() - p2.getAge());
        System.out.println("Sort by age: " + list2);

    };

}
