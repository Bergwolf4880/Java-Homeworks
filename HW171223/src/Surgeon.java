public class Surgeon extends Doctors {

    public Surgeon(String name, int ammountOfPatients, int salary, int bonus) {
        super(name, ammountOfPatients, salary, bonus);
    }

    public String toString() {
        return "Surgeon: " + getName() + " gets paid: " + getSalary() + "€";
    }

    public void speciality() {
        System.out.println(getName() + " is a surgeon, performs surgeries on " +getAmmountOfPatients()+" patients every day.");

    }
}
