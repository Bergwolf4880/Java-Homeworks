import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String number1 = "seven";
        String number2 = "seven";
        String number3 = "seven";
        int winnings = calcWinnings(number1, number2, number3);

        System.out.println("You have won "+winnings);

    }

    public static String inputScanner(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("You can play if you spell numbers correct!");
        System.out.println("Enter first number: ");
        String number1 = scanner.nextLine();
        System.out.println("Enter second number: ");
        String number2 = scanner.nextLine();
        System.out.println("Enter third number: ");
        String number3 = scanner.nextLine();
        return;
    }

    public static int calcWinnings(String number1, String number2, String number3) {
        int num1 = stringToInt(number1);
        int num2 = stringToInt(number2);
        int num3 = stringToInt(number3);

        boolean winCondition1 = num1 == 7 && num2 == 7 && num3 == 7; //1000
        boolean winCondition2 = num2 == num1-1 && num3 == num2-1; //500
        boolean winCondition3 = num2 == num1+1 && num3 == num2+1; //250

        if(winCondition1){
            return 1000;
        } else if (winCondition2) {
            return 500;
        }else if(winCondition3){
            return 250;
        }else {
            return 0;
        }
    }

    private static int stringToInt(String number) {
        switch (number) {
            case "one":
                return 1;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;

            default: return 0;
        }
    }
}


