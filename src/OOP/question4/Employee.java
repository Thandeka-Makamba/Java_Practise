package OOP.question4;

abstract public class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public abstract void work();

    public void displayInfo() {
        System.out.println("Name: " + this.getName() + ", Salary: R" + this.getSalary());
    }
}
