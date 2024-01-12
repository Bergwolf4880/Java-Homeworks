public class Student {

    private String name;
    private int missedLessons;
    private boolean jobcenter;

    public Student(String name, int missedLessons, boolean jobcenter) {
        this.name = name;
        this.missedLessons = missedLessons;
        this.jobcenter = jobcenter;
    }

    public String getName() {
        return name;
    }

    public int getMissedLessons() {
        return missedLessons;
    }

    public boolean isJobcenter() {
        return jobcenter;
    }

    @Override
    public String toString() {
        return  name  +
                ". Missed Lessons=" + missedLessons +
                ". Jobcenter=" + jobcenter;
    }
}
