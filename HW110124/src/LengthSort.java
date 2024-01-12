import java.util.Comparator;

public class LengthSort implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
            if(s1.getName().length()>s2.getName().length()) return  100;
            if(s1.getName().length()<s2.getName().length()) return  -100;
            return 0;


    }
}
