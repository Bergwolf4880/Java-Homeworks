import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Оля", 10);
        Person p2 = new Person("Коля", 4);
        Person p3 = new Person("Толя", 5);
        Person p4 = new Person("Николай", 5);
        Person p5 = new Person("Сергей", 5);

        List<Person> people = new ArrayList<>(List.of(p1, p2, p3, p4, p5));


        removePersonsByAgeRange(people, 4, 8);
        removePersonsByNameSubstring(people, "ол");

        System.out.println(people);


    }
    private static void removePersonsByAgeRange(List<Person> persons, int minAge, int maxAge) {
        persons.removeIf(new AgeMinMaxPredicate(minAge, maxAge));
    }

    private static void removePersonsByNameSubstring(List<Person> persons, String substring) {
        persons.removeIf(new SubstringPredicate(substring));
    }


}


