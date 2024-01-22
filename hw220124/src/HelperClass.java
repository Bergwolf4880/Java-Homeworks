
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HelperClass {


    public static String checkTwins(List<Person> checkDuplicateList) {
        Set<Person> temp = new HashSet<>(checkDuplicateList);
        int difference = checkDuplicateList.size() - temp.size();
        return temp.size() < checkDuplicateList.size() ?
                difference + " duplicates found" : "No duplicates";
    }

    public static Set<Person> removedPersons(List<Person> list) {
        Set<Person> temp = new HashSet<>();
        Set<Person> result = new HashSet<>();

        for (Person person : list) {
            if (!temp.add(person)) {
                result.add(person);
            }
        }
        return result;
    }


    public static String removeDupesFromString(String str) {
        Set<String> temp = new HashSet<>(Arrays.asList(str.split(",")));
        return temp.toString();
    }

    public static Set<Person> twoListsOneSet(List<Person> list1, List<Person> list2) {
        Set<Person> temp = new HashSet<>(list1);
        temp.addAll(list2);
        return temp;
    }

}
