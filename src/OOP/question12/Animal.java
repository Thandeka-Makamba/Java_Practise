package OOP.question12;

abstract public class Animal {

    private Mood mood;

    Animal(Mood mood) {
        this.mood = mood;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    abstract public void makeSound();
}
