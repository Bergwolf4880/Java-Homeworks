/*Реализовать метод (точнее три метода, используя while, do..while, for),
который считает сумму четных числа начиная от number1 до number2.
 Например:
        number1 = 10
        number2 = 15
        Вывод:36*/

public class Main {
    int num1 = 9;

    public static void main(String[] args) {

        //evenSumWhile();
        //evenSumFor();
        evenSumDo();


    }

    public static void evenSumWhile() {
        int num1 = 8;
        int num2 = 15;
        int evenSum = 0;

        while (num1 <= num2) {
            if (num1 % 2 == 0) {
                evenSum += num1;
            }
            num1++;
        }
        System.out.println(evenSum);
    }

    public static void evenSumFor() {
        int num1 = 8;
        int num2 = 15;
        int evenSum = 0;

        for (; num1 <= num2; num1++)
            if (num1 % 2 == 0)
                evenSum += num1;
        System.out.println(evenSum);
    }

    public static void evenSumDo() {

        int num2 = 15;
        int evenSum = 0;
        int numz = num1;
        do {

            if (num1 % 2 == 0) {

            }numz++;
            evenSum = evenSum + numz;
            System.out.println("Do/While: " + evenSum);

        } while (numz <= num2);

    }
}
