import java.util.Scanner;

public class Sender {

    public static void chooseWayToSendMail() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Привет! Выбери как ты хочешь отправить свою почту!");
        System.out.println("Выбери 1, что бы отправить Dhl.\n" +
                "Выбери 2, что бы отправить Email.\n" +
                "Выбери 3, что бы отправить Pigeon.");

        sendmail(scanner.nextInt());

    }
    private static void sendmail(int input) {

        switch (input) {
            case 1: send(new Dhl());break;
            case 2: send(new Email());break;
            case 3: send(new Pigeon());break;
            default:
                System.out.println("Такого варианта нет");

        }
    }
    private static void send(MailDeliveryService choiceOfService) {
        choiceOfService.sendMail();
    }

}
