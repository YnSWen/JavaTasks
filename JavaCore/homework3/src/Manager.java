import java.util.List;

/**
 * Класс руководителя, наследуемый от класса сотрудника
 */
public class Manager extends Employee{
    public Manager(String name, String date, int salary) {
        super(name, date, salary);
    }

    /**
     * Метод для повышения зарплат сотрудников, всех, кроме руководителей
     * @param employees  Все сотрудники
     * @param amount на сколько нужно поднять зарплату
     */
    public static void increaseSalaries(List<Employee> employees, int amount){
        for (Employee e: employees) {
            if (!(e instanceof Manager)){
                e.setSalary(e.getSalary() + amount);
            }
        }
    }


}
