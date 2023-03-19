import java.util.Objects;

public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private int department;
    private double salary;
    private static int count = 1;
    private int id;

    public Employee(String surname, String name, String patronymic, int department, double salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = count++;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
    public void setSurname(int department) {
        this.surname = surname;
    }
    public void setName(int department) {
        this.name = name;
    }
    public void setPatronymic(int department) {
        this.patronymic = patronymic;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setDepartment(int department) {
        this.department = department;
    }


    @Override
    public String toString() {
        return "Код: " + id +", Фамилия: " + surname + ", Имя: " + name + ", Отчество: " + patronymic +
                ", Отдел: " + department + ", Зарплата: ₽" + salary;
    }

    public String toStringWithoutDepartment(){
        return "Код: " + id +", Фамилия: " + surname + ", Имя: " + name + ", Отчество: " + patronymic +
                 ", Зарплата: ₽" + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(employee.salary, salary) == 0 && id == employee.id && Objects.equals(surname, employee.surname) && Objects.equals(name, employee.name) && Objects.equals(patronymic, employee.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, patronymic, department, salary, id);
    }
}
