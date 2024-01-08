/*Написать как минимум одну иерархию классов в которой будет один родительский класс и хотя бы два наследника,
расширяющих его функционал. Классы наследники должны иметь хотя бы 1 "собственный метод"
т.е. поведение, которое их отличает от класса родителя и от остальных потомков.*/

public class Main {
    public static void main(String[] args) {



        Doctors[] doctors = {
                new Surgeon("Dr. Black", 5, 10000, 1000),
                new Surgeon("Dr. White", 4, 9000, 1000),
                new Pediatrician("Dr. Pink", 25, 7000, 200),
                new Pediatrician("Dr. Red", 35, 7200, 400),
                new Orthopedist("Dr. Green", 14, 7000, 500),
                new Orthopedist("Dr. Blue", 17, 7500, 200)
        };

        for(Doctors doctor : doctors){
            doctor.speciality();
            doctor.paySalary();
        }
        System.out.println(doctors[0].getSalary());


    }
}