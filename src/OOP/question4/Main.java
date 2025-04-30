package OOP.question4;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Thandeka", 20000.00);
        Employee developer = new Developer("Thando", 10000.00);

        Employee[] employees = {manager, developer};
        for (Employee employee: employees) {
            employee.displayInfo();
            employee.work();
        }
    }
}
