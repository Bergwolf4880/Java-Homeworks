package model;

import java.util.Objects;

public class Account {

    private final String iban;
    private double balance;
    private final Person client;



    public Account(String iban, double balance, Person client) {
        this.iban = iban;
        this.balance = balance;
        this.client = client;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Person getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "iban='" + iban + " balance=" + balance +
                " client=" + client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (!Objects.equals(iban, account.iban)) return false;
        return Objects.equals(client, account.client);
    }

    @Override
    public int hashCode() {
        int result = iban != null ? iban.hashCode() : 0;
        result = 31 * result + (client != null ? client.hashCode() : 0);
        return result;
    }
}
