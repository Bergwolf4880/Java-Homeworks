public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("Giorgio");

        Team<Manager> mngTeam = new Team<>(manager);
        Team<QualityAssurance> qaTeam = new Team<>(manager);
        Team<Programmer> progTeam = new Team<>(manager);

        FrontEnd fe1 = new FrontEnd("Bob");
        FrontEnd fe2 = new FrontEnd("Dylan");
        FrontEnd fe3 = new FrontEnd("Doug");

        BackEnd be1 = new BackEnd("George");
        BackEnd be2 = new BackEnd("Rob");
        BackEnd be3 = new BackEnd("Donald");

        QualityAssurance qa1 = new QualityAssurance("Jenny");
        QualityAssurance qa2 = new QualityAssurance("Dorothy");
        QualityAssurance qa3 = new QualityAssurance("Melissa");

        qaTeam.addEmployee(qa1);
        qaTeam.addEmployee(qa2);
        qaTeam.addEmployee(qa3);

        progTeam.addEmployee(be1);
        progTeam.addEmployee(be2);
        progTeam.addEmployee(be3);

        progTeam.addEmployee(fe1);
        progTeam.addEmployee(fe2);
        progTeam.addEmployee(fe3);

        System.out.println(progTeam);
        System.out.println("°".repeat(100));
        System.out.println(qaTeam);
    }
}