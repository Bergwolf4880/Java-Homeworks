import java.util.function.Predicate;

public class SubstringPredicate implements Predicate<Person> {

private String substring;

    public SubstringPredicate(String substring) {
        this.substring = substring;
    }

    @Override
    public boolean test(Person person) {
        return !person.getName().toLowerCase().contains(substring);
    }
}
