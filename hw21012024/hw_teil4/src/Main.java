import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> people = new ArrayList<>(List.of("John,18","Jack,20","Bob,30","Bill,25","Kirk,30"));


        List<Person> newList = TransformToList.transformToList(people);

        for(Person person : newList){
            System.out.println(person);
        }



    }

}