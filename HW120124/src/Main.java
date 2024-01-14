import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Transaction> transactionList = new ArrayList<>(List.of(
                new Transaction(
                        new Account("GB24BARC20035329723568", new Person("Jack Black")),
                        new Account("GB61BARC20038036825286", new Person("Josh Green")),
                        6000.0, CurrencyType.GBP),
                new Transaction(
                        new Account("EE881273339741796216", new Person("Jack Black")),
                        new Account("EE551241989676955672", new Person("Toomas Leedu")),
                        1000.0, CurrencyType.EUR),
                new Transaction(
                        new Account("CH2989144144873693386", new Person("Barack Obama")),
                        new Account("FI2969336583485981", new Person("Urmas Joulupukki")),
                        600.0, CurrencyType.USD),
                new Transaction(
                        new Account("DE34500105173297473358", new Person("Mathias Schweighöfer")),
                        new Account("GB61BARC20038036825286", new Person("Martin Soeder")),
                        35000.0, CurrencyType.EUR),
                new Transaction(
                        new Account("GB24BARC20035329723568", new Person("Boriss Johnson")),
                        new Account("UA418139978363866888984752269", new Person("Vitaly Klitchko")),
                        15000.0, CurrencyType.GBP)
        ));

        //Collections.sort(transactionList, new ComparatorBySum());
        //Collections.sort(transactionList, new ComparatorById());
        //System.out.println(transactionList);
        Collections.sort(transactionList, new ComparatorByCurrency());
        System.out.println(transactionList);
 //       Collections.sort(transactionList);
  //      System.out.println(transactionList);

    }
}