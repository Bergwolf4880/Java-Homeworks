/*Реализовать метод (точнее три метода, используя while, do..while, for),
который считает сумму четных числа начиная от number1 до number2.
 Например:
        number1 = 10
        number2 = 15
        Вывод:36*/

public class Main {

    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 15;

        //evenSumWhile(num1, num2);
        //evenSumFor( num1, num2);
        evenSumDo(num1, num2);

    }

    public static void evenSumWhile(int num1, int num2) {

        int evenSum = 0;

        while (num1 <= num2) {
            if (num1 % 2 == 0) {
                evenSum += num1;
            }
            num1++;
        }
        System.out.println(evenSum);
    }

    public static void evenSumFor(int num1, int num2) {


        for (; num1 <= num2; num1++)
            if (num1 % 2 == 0){
                System.out.println(num1);
            }
    }

    public static void evenSumDo(int num1, int num2) {


        do {
            ++num1;
            if (num1 % 2 == 0) {

                System.out.println("Do/While: "+num1);
            }

        } while (num1 <= num2);
    }
}