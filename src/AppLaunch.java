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

        double percent = 5;
        indexSalary(percent);
        printAllEmployees();

        int departmentNumber = 4;
        findEmployeeMinSalaryDepartment(departmentNumber);
        findEmployeeMaxSalaryDepartment(departmentNumber);
        calculateTotalSalaryDepartment(departmentNumber);
        calculateAverageSalaryDepartment(departmentNumber);
        indexSalaryDepartment(departmentNumber, percent);
        printEmployeesDepartment(departmentNumber);

        double salary = 30000;
        findEmployeesWithSalaryLessThan(salary);
        findEmployeesWithSalaryGreaterThanOrEqual(salary);

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

    public static void indexSalary(double percent) {
        for (Employee employee : employees) {
            double newSalary = employee.getSalary() * (1 + percent / 100);
            employee.setSalary(newSalary);
        }
        System.out.println("Проиндексированная зароботная плата сотрудников: ");
    }

    public static void findEmployeeMinSalaryDepartment(int departmentNumber) {
        Employee minEmployee = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentNumber) {
                if (minEmployee == null || employee.getSalary() < minEmployee.getSalary()) {
                    minEmployee = employee;
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + minEmployee);
        System.out.println("\n");

    }

    public static void findEmployeeMaxSalaryDepartment(int departmentNumber) {
        Employee maxEmployee = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentNumber) {
                if (maxEmployee == null || employee.getSalary() > maxEmployee.getSalary()) {
                    maxEmployee = employee;
                }
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + maxEmployee);
        System.out.println("\n");
    }

    public static double calculateTotalSalaryDepartment(int departmentNumber) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentNumber) {
                totalSalary += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат отдела №" + departmentNumber + " на заработную плату: ₽" + totalSalary);
        System.out.println("\n");
        return totalSalary;
    }

    public static void calculateAverageSalaryDepartment(int departmentNumber) {
        double totalSalary = calculateTotalSalaryDepartment(departmentNumber);
        int employeeCount = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentNumber) {
                employeeCount++;
            }
        }
        System.out.println("Средняя заработная плата по отделу №" + departmentNumber+ ": ₽" + totalSalary/employeeCount);
        System.out.println("\n");
    }

    public static void indexSalaryDepartment(int departmentNumber, double percent) {
        System.out.println("Проиндексированная зароботная плата сотрудников отдела №" + departmentNumber + ": ");
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentNumber) {
                double newSalary = employee.getSalary() * (1 + percent / 100);
                employee.setSalary(newSalary);
                System.out.println(employee.toString());
            }
        }
        System.out.println("\n");
    }
    public static void printEmployeesDepartment(int departmentNumber) {
        System.out.println("Все сотрудники отдела №" + departmentNumber + ": ");
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentNumber) {
                System.out.println("Код: " + employee.getId() +", Фамилия: " + employee.getSurname() + ", Имя: " + employee.getName() +
                        ", Отчество: " + employee.getPatronymic() + ", Зарплата: ₽" + employee.getSalary());
            }
        }
        System.out.println("\n");
    }
    public static void findEmployeesWithSalaryLessThan(double salary) {
        System.out.println("Все сотрудники с заработной платой меньше ₽" + salary);
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println("Код: " + employee.getId() +", Фамилия: " + employee.getSurname() + ", Имя: " + employee.getName() +
                        ", Отчество: " + employee.getPatronymic() + ", Зарплата: ₽" + employee.getSalary());
            }
        }
        System.out.println("\n");
    }

    public static void findEmployeesWithSalaryGreaterThanOrEqual(double salary) {
        System.out.println("Все сотрудники с заработной платой больше или равной ₽" + salary);
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.println("Код: " + employee.getId() +", Фамилия: " + employee.getSurname() + ", Имя: " + employee.getName() +
                        ", Отчество: " + employee.getPatronymic() + ", Зарплата: ₽" + employee.getSalary());
            }
        }
    }
}