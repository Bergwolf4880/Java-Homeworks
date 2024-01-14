public class Transaction implements Comparable<Transaction>{
    private static int counter = 0;
    private int id;
    private Account accDebit;
    private Account accCredit;
    private double amount;
    private CurrencyType currency;


    public Transaction(Account accDebit, Account accCredit, double amount, CurrencyType currency) {
        this.accCredit = accCredit;
        this.accDebit = accDebit;
        this.amount = amount;
        this.currency = currency;
        counter++;
        id = counter;

    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public CurrencyType getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Transaction id= " + id +
                ", Debit=" + accDebit +
                ", Credit=" + accCredit +
                ", amount=" + amount +
                ", currency=" + currency+"\n";
    }

    @Override
    public int compareTo(Transaction o) {
        return o.getId()-this.id;
    }
}
