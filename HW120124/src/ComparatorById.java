import java.util.Comparator;

public class ComparatorById implements Comparator<Transaction> {

    @Override
        public int compare(Transaction o1, Transaction o2) {
            if(o1.getId()<o2.getId()){
                return 1;
            }
            if(o1.getId()>o2.getId()){
                return -1;
            }
            return 0;
    }
}


