import java.util.Comparator;

public class MissedLessonsSort implements Comparator<Student>{

    public int compare(Student s1, Student s2) {
        if(s1.getMissedLessons()>s2.getMissedLessons()) return 100;
        if(s1.getMissedLessons()<s2.getMissedLessons()) return  -100;
        return  0;

    }

}
