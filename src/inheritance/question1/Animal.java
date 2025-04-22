package inheritance.question1;

/*

QUESTION1

Create a class called Animal with a method makeSound() that prints "Some generic animal sound".
Then, create a class Dog that inherits from Animal and overrides makeSound() to print "Woof!".
Instantiate both Animal and Dog, and call makeSound() on each.

QUESTION 2

Create a new class called Cat that extends Animal. Override the makeSound() method to print "Meow!".

Now, in your Main class:

Create an array of Animal objects with 3 elements: a Dog, a Cat, and a regular Animal.

Loop through the array and call makeSound() on each element.

QUESTION 3

Add a method to the Dog class called fetch(), which prints "Dog is fetching the ball!".

In the Main class, loop through the same array of Animal objects.

For each object, call makeSound() as before.

If the object is an instance of Dog, also call fetch().

Use the instanceof keyword and casting to make this work.

 */

public class Animal {

    public void makeSound() {
        System.out.println("Brrrrr");
    }
}
