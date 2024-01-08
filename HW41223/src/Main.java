

public class Main {
    public static void main(String[] args) {

        //region Client Accounts
        Account[] clients = {
                new Account("DE31500105171979783411", 23323.21,
                        new Person("John", "Doe", new MyDate(1982, 6, 6)),
                        new MyDate(2025, 4, 2)),

                new Account("DE81564", 323.15,
                        new Person("Samantha", "Jones", new MyDate(1968, 2, 5)),
                        new MyDate(2021, 6, 13)),

                new Account("TN8425183414187237278837", 723323.78,
                        new Person("Travis", "Drinkwater", new MyDate(1982, 12, 16)),
                        new MyDate(2015, 7, 15)),

                new Account("PL61109024023325239786498322", 213323.9,
                        new Person("Amanda", "Smith", new MyDate(1952, 3, 25)),
                        new MyDate(2020, 8, 4)),

                new Account("GB57654654687475521355456", 656323.5,
                        new Person("Mike", "Rotch", new MyDate(2000, 1, 5)),
                        new MyDate(2025, 9, 5)),

                new Account("DE8435938434583948345", 1092922.8,
                        new Person("Vassili", "Pupkin", new MyDate(1995, 5, 19)),
                        new MyDate(2030, 3, 20))
        };

        AccountManager manager = new AccountManager(clients);


        manager.getBalanceOverLimit(50000);
        System.out.println("All the finances after the count - " + manager.accountBalanceSummary() + " €");
        System.out.println("------------------------------");

        System.out.println(manager.getAccounts()[4].getOwner().getFirstName().toString());
        manager.getAccounts()[4].getOwner().setFirstName("Marcello");
        manager.getAccounts()[2].getOwner().setLastName("Travolta");
        manager.getAccounts()[0].getOwner().getBirthday().setDay(34);
        System.out.println(manager.getAccounts()[4].getOwner().getFirstName().toString());
        System.out.println(manager.getAccounts()[2].getOwner().getLastName().toString());
        System.out.println("------------------------------");
        System.out.println(manager.getAccounts()[2].getOwner().getBirthday().toString());
        System.out.println("------------------------------");
        System.out.println(manager.getAccounts()[0].getOwner().getFirstName());
        System.out.println(manager.getAccounts()[0].getOwner().getBirthday());


    }
}
