public class Pediatrician extends Doctors{

    public Pediatrician(String name, int ammountOfPatients, int salary, int bonus){
        super(name, ammountOfPatients, salary, bonus);
    }

    public String toStr  ing() {
        return "Pediatrician: " + getName() + " gets paid: " + getSalary() + "€";
    }

    public void speciality() {
        System.out.println(getName() +
                " is a pediatrician, diagnoses and treats illnesses and injuries for "
                +getAmmountOfPatients()+" patients every day.");

    }

}
