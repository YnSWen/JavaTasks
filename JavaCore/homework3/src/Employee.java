import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Класс для описания сотрудника
 */
public class Employee {

    private String name;
    private LocalDate date;

    private int salary;


    /**
     * Конструктор
     * @param name имя сотрудника
     * @param date дата рождения сотрудника, записывается с помощью метода SetDate
     * @param salary зарплата сотрудника
     */
    public Employee(String name, String date, int salary) {
        this.name = name;
        setDate(date);
        this.salary = salary;
    }

    public void setDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.date = LocalDate.parse(date, formatter);
    }

    /**
     * Геттеры и Сеттеры
     */
    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Прототип компаратора
     * @param other Второй сотрудник для сравнения
     */
    public int compareDates(Employee other){
        return this.date.compareTo(other.date);

    }

    @Override
    public String toString() {
        return "name - " + name +
                ", date - " + date +
                ", salary - " + salary;
    }
}



