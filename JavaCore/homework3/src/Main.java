import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * Создание списка сотрудников
         */

        Employee em1 = new Employee("Nikolas", "1989-06-09", 80000);
        Employee em2 = new Employee("Kleo", "1999-09-13", 70000);
        Employee em3 = new Employee("Bill", "2000-08-19", 69000);
        Manager m1 = new Manager("Josh", "1976-12-20", 100000);


        List<Employee> employees = new ArrayList<Employee>();

        employees.add(em1);
        employees.add(em2);
        employees.add(em3);
        employees.add(m1);

        System.out.println("Cписок сотрудников до повышения зарплаты:");

        for (Employee e : employees){
            System.out.println(e);
        }

        Manager.increaseSalaries(employees, 10000);

        System.out.println("Повышение зарплаты на 10000:");

        for (Employee e : employees){
            System.out.println(e);
        }



    }
}