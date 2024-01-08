public class Orthopedist extends Doctors {

    public Orthopedist(String name, int ammountOfPatients, int salary, int bonus) {
        super(name, ammountOfPatients, salary, bonus);
    }

    public String toString() {
        return "Orthopedist: " + getName() + " gets paid: " + getSalary() + "€";
    }

    public void speciality() {
        System.out.println(getName() +
                " is a orthopedist. Diagnoses, prevents and treats "
                + getAmmountOfPatients() + "patients with skeletal deformities every day.");

    }

}
