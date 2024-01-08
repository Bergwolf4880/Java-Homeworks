public class Doctors {

    private String name;

    private int ammountOfPatients;

    private int salary;

    private int bonus;

    public Doctors(String name, int ammountOfPatients, int salary, int bonus) {
        this.name = name;
        this.ammountOfPatients = ammountOfPatients;
        this.salary = salary;
        this.bonus = bonus;
    }

    private int salaryBonus() {
        int payment = getSalary();
        int paymentWithBonus = payment + bonus;
        return paymentWithBonus;
    }

    public void speciality() {
    }

    public String getName() {
        return name;
    }

    public int getAmmountOfPatients() {
        return ammountOfPatients;
    }

    public int getSalary() {
        return salary;
    }

    public void paySalary() {
        System.out.println("Earns " + salaryBonus() + " € \nwhich is "+bonus+"€ premie.");
    }
}
