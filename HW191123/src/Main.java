import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int coffeeOrder;

        do{
        coffeeOrder = readIntFromScanner("Choose your coffee");
        serveCoffee(coffeeOrder);

    }while(coffeeOrder>=1&&coffeeOrder<=3);

    public static int readIntFromScanner(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        System.out.println("For Espresso press 1; Flat white 2; Cappuccino 3;");
        System.out.println("or any other numbers to exit");
        return scanner.nextInt();
    }

    public static void serveCoffee(int coffeeOrder) {

        Coffee coffee = new Coffee(coffeeOrder);
        coffee.outputCoffee();

    }
}