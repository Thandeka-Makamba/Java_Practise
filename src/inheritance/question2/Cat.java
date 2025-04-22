package inheritance.question2;

import inheritance.question1.*;


/*

Create a new class called Cat that extends Animal. Override the makeSound() method to print "Meow!".

Now, in your Main class:

Create an array of Animal objects with 3 elements: a Dog, a Cat, and a regular Animal.

Loop through the array and call makeSound() on each element.

 */

public class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
