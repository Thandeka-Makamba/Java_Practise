package inheritance.question10;

public class Main {
    public static void main(String[] args) {
        Person student = new Student();
        Person teacher = new Teacher();

        Person[] people = {student, teacher};
        for (Person person: people) {
            if (person instanceof Teacher) {
                person.greet();
                ((Teacher) person).teach();
            } else {
                person.greet();
            }
        }
    }
}
