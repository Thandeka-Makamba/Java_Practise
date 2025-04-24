package inheritance.question7;

/*

Create a class called Animal with a method sound() that prints "Animal sound". Then, create two subclasses: Lion and Elephant.
Each subclass should override the sound() method to print "Roar" and "Trumpet", respectively. In the Main class, create a method makeSound()
 that takes an Animal object as a parameter and calls its sound() method. Call makeSound() with both a Lion and an Elephant object.

 */

public class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
}
