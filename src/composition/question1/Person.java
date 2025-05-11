package composition.question1;

public class Person {

    Heart heart = new Heart();

    public void live() {
        heart.beat();
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.live();
    }
}
