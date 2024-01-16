public class QualityAssurance extends Employee{


    private String name;

    public QualityAssurance(String name) {
        super(name);
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "QA " + name;
    }

}
