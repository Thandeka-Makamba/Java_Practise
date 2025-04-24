package inheritance.question5;

/*

Create a class hierarchy to represent different types of employees in a company.

A base class called Employee that has a method work() which prints "Employee is working...".

A subclass called Manager that overrides the work() method to print "Manager is managing the team...".

In the Main class, create one Employee object and one Manager object. Call the work() method on

 */

public class Employee {
    public void work() {
        System.out.println("Employee is working...");
    }
}
