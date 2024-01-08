//        Допустим, у вас есть класс Account со следующими полями String IBAN, double balance, Person client.
//        Person имеет следующие поля: String firstName, String lastName.
//        Вам дан массив из Account. Вам необходимо реализовать метод findAccountsByPerson,
//        который принимает объект Person и выводит на экран все Account принадлежащие данному пользователю.

import model.Account;
import model.Person;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Account client1 = new Account("DE14231231131213112", 4500.0, new Person("Joe", "Bidet"));
        Account client2 = new Account("PL46446536345633453", 2500.0, new Person("Joe", "Bidet"));
        Account client3 = new Account("AT142131213112", 4500.0, new Person("Jorje", "Bush"));
        Account client4 = new Account("FR142299831231131213112", 4500.0, new Person("Michael", "O'Baba"));

        Account test = new Account("AT142131213112", 4500.0, new Person("Jorje", "Bush"));

        Account[] array = {client1, client2, client3, client4};

        array[0].setBalance(100000);

        Person searchedName = new Person("Joe", "Bidet");


        System.out.println("--------------------------------");
        findAccountByPerson(array, searchedName);
        System.out.println("--------------------------------");
        print(array);
        System.out.println("--------------------------------");
        System.out.println(isAccountPresent(array, test));
        System.out.println("--------------------------------");
        addMoney(array);
        print(array);


    }

    public static void print(Account[] accounts) {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    public static void addMoney(Account[] accounts) { // Добавляет случайное число
        Random random = new Random();
        int max = 10;
        int min = -10;

        for (Account acc : accounts) {
            int rnd = random.nextInt(max - min + 1) + min; // Формула для генерации
            acc.setBalance(rnd);
        }
    }

    public static boolean isAccountPresent(Account[] array, Account account) {
        for (Account acc : array) {
            if (account.equals(acc)) {
                return true;
            }
        }
        return false;
    }

    public static void findAccountByPerson(Account[] array, Person search) {
        for (Account arr : array) {
            if (arr.getClient().equals(search)) {
                System.out.println(arr);
            }
        }
    }


}