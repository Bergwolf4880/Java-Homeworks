public class Employee {

    private String name;
    private int yearsInCompany;

    public Employee(String name, int yearsInCompany) {
        this.name = name;
        this.yearsInCompany = yearsInCompany;
    }

    public String getName() {
        return name;
    }

    public int getYearsInCompany() {
        return yearsInCompany;
    }

    @Override
    public String toString() {
        return  name +  "yearsInCompany: " + yearsInCompany;
    }
}
