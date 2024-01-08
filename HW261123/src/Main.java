/*Создайте программу для проверки пароля, введенного пользователем.
Пароль считается валидным, если он не короче 8 символов и содержит хотя бы одну цифру.
Естественно, используйте цикл и charAt для анализа каждого символа пароля.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String passwordForVerification = passwordInput();
        int checkDigit = passwordDigitCheck(passwordForVerification);
        int checkLength = passwordForVerification.length();

        String result = checkLength > 8 && checkDigit >= 1 ? "That is valid password" : "That is invalid password";

        System.out.println(result);

    }

    public static int passwordDigitCheck(String userInput) {
        int count = 0;
        for (int i = 0; i < userInput.length(); i++) {
            if (Character.isDigit(userInput.charAt(i))) {
                count++;
                break;
            }
        }
        return count;
    }

    public static String passwordInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the password");
        System.out.println("It should be at least 8 digits and contain numbers:");
        return scanner.nextLine();
    }
}