import java.util.Comparator;
public class ComparatorByCurrency implements Comparator<Transaction>{
    @Override
    public int compare(Transaction o1, Transaction o2 ) {
        int compareCurrency = o1.getCurrency().compareTo(o2.getCurrency());
        if(compareCurrency==0){
            return (int) (o2.getAmount()-o1.getAmount());
        }
        return compareCurrency;


    }
}
