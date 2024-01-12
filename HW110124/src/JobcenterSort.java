import java.util.Comparator;

public class JobcenterSort implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        if (s1.isJobcenter() == s2.isJobcenter()) {
            return s2.getMissedLessons() - s1.getMissedLessons();
        }
        if (s1.isJobcenter() == !s2.isJobcenter()) {
            return s1.getMissedLessons() - s2.getMissedLessons();
        }
        return 0;
    }
}