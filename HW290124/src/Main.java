import java.util.*;

public class Main {
    public static void main(String[] args) {


        Programmer pr1 = new Programmer("George", List.of(new Task(4161, "Learn interface", 5, Status.PROCESSED), new Task(66690, "Learn Generics", 7, Status.PROCESSED)), "Berlin");
        Programmer pr2 = new Programmer("John", List.of(new Task(12481, "Learn SQL", 5, Status.PROCESSED), new Task(66690, "Learn Postgress", 7, Status.PROCESSED)), "NY");
        Programmer pr3 = new Programmer("Jack", List.of(new Task(33406, "Smart home", 2, Status.DONE), new Task(66690, "Learn Generics", 7, Status.PROCESSED)), "London");
        Programmer pr4 = new Programmer("Jenna", List.of(new Task(2197553, "Taxi app", 1, Status.CANCELLED), new Task(526890, "Help Yandex", 3, Status.DONE)), "Moscow");
        Programmer pr5 = new Programmer("Maria", List.of(new Task(150273, "Learn JavaScript", 45, Status.PROCESSED), new Task(533524, "CSS", 15, Status.PROCESSED)), "Tallinn");
        Programmer pr6 = new Programmer("Bill", List.of(new Task(2081, "Backup database", 1, Status.DONE), new Task(537730, "Faceboob app", 2, Status.DONE)), "Tallinn");
        Programmer pr7 = new Programmer("Monica", List.of(new Task(526890, "Help Yandex", 3, Status.DONE), new Task(4269762, "Tinder", 7, Status.CANCELLED)), "Paris");

        List<Programmer> programmer = new ArrayList<>(List.of(pr1, pr2, pr3, pr4, pr5, pr6, pr7));

        List<Task> tasksList = Task.getTasksList(programmer);
        System.out.println(tasksList);
        System.out.println("°".repeat(200));
        Map<Boolean, List<Task>> task2 = Task.doneTaskMap(programmer);
        System.out.println("°".repeat(200));

        Map<Task, List<Programmer>> mapTaskProgrammer = Programmer.getMapTaskProgrammer(programmer);
        System.out.println(mapTaskProgrammer);
    }


}