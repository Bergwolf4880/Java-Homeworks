import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String names = "John,Jack,Jill,Bob,Ryan,Jack";

        List<Person> list1 = new ArrayList<>(List.of(
                new Person("Bilbo"),
                new Person("Frodo"),
                new Person("Pippin"),
                new Person("Sam"),
                new Person("Gandalf"),
                new Person("Frodo")));

        List<Person> list2 = new ArrayList<>(List.of(
                new Person("Gollum"),
                new Person("Aragorn"),
                new Person("Legolas"),
                new Person("Gimli"),
                new Person("Sauron"),
                new Person("Boromir")));


        System.out.println(HelperClass.checkTwins(list1));

        System.out.println(HelperClass.removeDupesFromString(names));

        Set<Person> sortedList = HelperClass.twoListsOneSet(list1,list2);
        System.out.println(sortedList);

        Set<Person> temp1 =HelperClass.removedPersons(list1);
        System.out.println(temp1);
    }




}