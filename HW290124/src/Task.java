import java.util.*;
import java.util.stream.Collectors;

public class Task {

    private int id;
    private String title;
    private int days;
    Status status;

    public Task(int id, String title, int days, Status status) {
        this.id = id;
        this.title = title;
        this.days = days;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getDays() {
        return days;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (id != task.id) return false;
        if (days != task.days) return false;
        if (!Objects.equals(title, task.title)) return false;
        return status == task.status;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + days;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    public static List<Task> getTasksList(List<Programmer> programmers) {
        List<Task> tasks = programmers.stream()
                .flatMap(p -> p.getList().stream())
                .filter(task -> task.status == Status.DONE)
                .sorted((o1, o2) -> o2.days - o1.days)
                .collect(Collectors.toList());
        return tasks;
    }

    public static Map<Boolean, List<Task>> doneTaskMap(List<Programmer> list) {
        Map<Boolean, List<Task>> temp = list.stream()
                .flatMap(p -> p.getList().stream())
                .collect(Collectors.partitioningBy(status -> status.getStatus() == Status.DONE));

        for (Map.Entry<Boolean, List<Task>> entry : temp.entrySet()) {
            boolean key = entry.getKey();
            List<Task> value = entry.getValue();

            System.out.println("Key: " + key + ", Value: " + value);
        }
        return temp;
    }



    public String toString() {
        return "Task id: " + id +
                " " + title + " days=" + days +
                " status" + status;
    }
}
