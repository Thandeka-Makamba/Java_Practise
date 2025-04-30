package OOP.question4;

public class Developer extends Employee {

    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("Writing code \n");
    }
}
