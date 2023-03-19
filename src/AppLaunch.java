public class AppLaunch {
    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Смирнова", "Юлия", "Михайловна", 2, 29500);
        employees[1] = new Employee("Иванов", "Андрей", " Сергеевич", 1, 27900);
        employees[2] = new Employee("Соколов", "Денис", "Андреевич", 4, 26450);
        employees[3] = new Employee("Григорьев", "Игорь", "Викторович", 4, 22000);
        employees[4] = new Employee("Орлова", "Ольга", "Петровна", 5, 36748);
        employees[5] = new Employee("Тимофеев", "Сергей", "Владимирович", 1, 41000);
        employees[6] = new Employee("Никитин", "Дмитрий", "Андреевич", 3, 28700);
        employees[7] = new Employee("Морозова", "Татьяна", "Васильевна", 2, 42690);
        employees[8] = new Employee("Краснов", "Артём", "Сергеевич", 4, 39800);
        employees[9] = new Employee("Ковалев", " Даниил", "Сергеевич", 5, 36889);
        printAllEmployees();
        totalSalaryMonth();
        employeeWithLowestSalary();
        employeeWithHighestSalary();
        averageSalary();
        printAllEmployeeFullName();

        employees[6].setSalary(31540);
        printAllEmployees();

    }

    public static void printAllEmployees() {
        for (Employee employees : employees) {
            if (employees != null) {
                System.out.println(employees.toString());
            }
        }
        System.out.println("\n");
    }

    public static void totalSalaryMonth() {
        double totalCost = 0;
        for (Employee employees : employees) {
            if (employees != null) {
                totalCost += employees.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц: ₽" + totalCost);
        System.out.println("\n");
    }

    public static void employeeWithLowestSalary() {
        Employee minEmployee = null;
        double minSalary = Double.MAX_VALUE;
        for (Employee employees : employees) {
            if (employees != null && employees.getSalary() < minSalary) {
                minEmployee = employees;
                minSalary = employees.getSalary();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + minEmployee);
        System.out.println("\n");
    }

    public static void employeeWithHighestSalary() {
        Employee maxEmployee = null;
        double maxSalary = Double.MIN_VALUE;
        for (Employee employees : employees) {
            if (employees != null && employees.getSalary() > maxSalary) {
                maxEmployee = employees;
                maxSalary = employees.getSalary();
            }
        }
        System.out.println("Сотрудника с максимальной зарплатой: " + maxEmployee);
        System.out.println("\n");
    }

    public static void averageSalary() {
        double totalSalary = 0;
        int count = 0;
        for (Employee employees : employees) {
            if (employees != null) {
                totalSalary += employees.getSalary();
                count++;
            }
        }
        System.out.println("Среднее значение зарплат: ₽" + totalSalary / count);
        System.out.println("\n");
    }
    public static void printAllEmployeeFullName() {
        System.out.println("Ф.И.О всех сотрудников: ");
        for (Employee employees : employees) {
            if (employees != null)
            {
                System.out.print(employees.getName() + " ");
                System.out.print(employees.getSurname() + " ");
                System.out.println(employees.getPatronymic());
            }
        }
        System.out.println("\n");
    }
}