package OOP.question4;

public class Manager extends Employee{

    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("Managing team \n");
    }
}
