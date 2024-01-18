import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Integer> randomNumbers = new ArrayList<>();
        addRandomNumbersToList(randomNumbers);
        System.out.println(randomNumbers);

        List<Integer> randomNumbersRandomIndex = new ArrayList<>();
        long wtf = System.currentTimeMillis();
        addRandomNumbersToRandomIndex(randomNumbersRandomIndex);
        System.out.println((System.currentTimeMillis()-wtf)/1000); // 52 seconds
        System.out.println(randomNumbersRandomIndex);

        List<Integer> randomNumbersRandomIndex1 = new LinkedList<>();
        long wtf2 = System.currentTimeMillis();
        addRandomNumbersToRandomIndex(randomNumbersRandomIndex1);
        System.out.println((System.currentTimeMillis() - wtf2) / 1000); //  seconds
        System.out.println(randomNumbersRandomIndex);

        List<Person> people = new ArrayList<>();
        Person p1 = new Person("Jack", 18);
        Person p2 = new Person("John", 80);
        Person p3 = new Person("Jamie", 20);
        Person p4 = new Person("Joconda", 50);
        Person p5 = new Person("Joshua", 20);
        Person p6 = new Person("Johnatan", 16);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);

    }

    public static void addRandomNumbersToList(List<Integer> numbers) {
        for (int i = 0; i <= 1000000; i++) {
            numbers.add(getRandomInteger());
        }
    }

    public static int getRandomInteger() {
        int min = 436874;
        int max = 6874668;
        return getRandomInteger(min, max);
    }

    public static int getRandomInteger(int min, int max) {
        return min + (int) (Math.random() * (max - min));
    }

    public static void addRandomNumbersToRandomIndex(List<Integer> list) {

        while (list.size() < 1000000) {
            int index = getRandomInteger(0, list.size());
            list.add(index, getRandomInteger());
        }
    }

    private static List<String> returnListOfNames(List<Person> people) {
        List<String> sortedPeople = new ArrayList<>();
        for (Person person : people) {
            if (person.getAge() >= 20) {
                sortedPeople.add(person.getName());
            }
        }
        return sortedPeople;
    }

    public static int amountOfDuplicatePerson(List<Person> people, Person searchedPerson) {
        int counter = 0;
        for(Person person : people){
            if(person.getName().equals(searchedPerson.getName())){
                counter++;
            }
        }
        return counter;
    }

    public static void myLinedList(List<Person> people, Person person, int index){
        people.add(index, person);
    }

}