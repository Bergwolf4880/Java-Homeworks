import java.util.function.Predicate;

public class AgeMinMaxPredicate implements Predicate<Person> {


    private final int minAge;
    private final int maxAge;

    public AgeMinMaxPredicate(int minAge, int maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
    }


    @Override
    public boolean test(Person person) {
        return person.getAge() <= minAge || person.getAge() > maxAge;

    }
}