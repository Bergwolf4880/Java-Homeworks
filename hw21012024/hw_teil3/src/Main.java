import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Immanuel Kerr", 10);
        Employee e2 = new Employee("Felix Moreno", 7);
        Employee e3 = new Employee("Rodrigo Perry", 9);
        Employee e4 = new Employee("Braden Campbell", 10);
        Employee e5 = new Employee("Cassidy Church", 9);
        Employee e6 = new Employee("Cameron Hart", 6);
        Employee e7 = new Employee("Logan Morgan", 5);
        Employee e8 = new Employee("Davon Doyle", 7);
        Employee e9 = new Employee("Saige Harmon", 10);

        List<Employee> staff = new ArrayList<>(List.of(e1, e2, e3, e4, e5, e6, e7, e8, e9));
        System.out.println(staff);

        List<Employee> award = employeesWithMostExperience(staff, 9);
        System.out.println(award);

    }
    private static List<Employee> employeesWithMostExperience(List<Employee> staff, int years) {
        List<Employee> temp = new ArrayList<>();
        for (Employee employee : staff) {
            if (employee.getYearsInCompany() >= years) {
                temp.add(employee);
            }
        }
        return temp;
    }


}