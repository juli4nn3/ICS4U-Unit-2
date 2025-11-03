
/* 
 * This program uses the JuliStack class
 * 
 * @author Julianne Leblanc-Peltier
 * @version 1.0
 * since    Oct 30, 2025
 * /

 /**
  * This program uses the Stack.
  */

  import java.util.Scanner;

  public final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this is ever called
     *
     * @throws IllegalStateException if this is ever called
     *
     */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */

    public static void main(final String[] args) {
        // this method uses the JuliStack class

        // fruit stack
        
        JuliStack fruitStack = new JuliStack();

        System.out.println("\n\nFruit items: ");
        System.out.println("The size of the stack is: " + fruitStack.stringSize());
        System.out.println("Is the stack empty? " + fruitStack.isEmpty());

        fruitStack.pushItem("apple");
        fruitStack.pushItem("banana");
        fruitStack.pushItem("cherry");

        System.out.println("Fruit items: " + fruitStack.showStack());

        System.out.println("Popped fruit item: " + fruitStack.popItem());
        System.out.println("fruit items: " + fruitStack.showStack());
        System.out.println("The size of the stack is: " + fruitStack.stringSize());
        System.out.println("Is the stack empty? " + fruitStack.isEmpty());
        System.out.println("the top fruit is: " + fruitStack.peekItem());
        System.out.println("Emptying the stack ...");
        fruitStack.clearStack();
        System.out.println("The size of the stack is: " + fruitStack.stringSize());
        System.out.println("Is the stack empty? " + fruitStack.isEmpty());

        // colour stack

        JuliStack colourStack = new JuliStack();

        System.out.println("\n\nColour items: ");
        System.out.println("The size of the stack is: " + colourStack.stringSize());
        System.out.println("Is the stack empty? " + colourStack.isEmpty());

        colourStack.pushItem("red");
        colourStack.pushItem("green");
        colourStack.pushItem("blue");

        System.out.println("Colour items: " + colourStack.showStack());

        System.out.println("Popped colour item: " + colourStack.popItem());
        System.out.println("colour items: " + colourStack.showStack());
        System.out.println("The size of the stack is: " + colourStack.stringSize());
        System.out.println("Is the stack empty? " + colourStack.isEmpty());
        System.out.println("the top colour is: " + colourStack.peekItem());
        System.out.println("Emptying the stack ...");
        colourStack.clearStack();
        System.out.println("The size of the stack is: " + colourStack.stringSize());
        System.out.println("Is the stack empty? " + colourStack.isEmpty());

        // dog stack

        JuliStack dogStack = new JuliStack();

        System.out.println("\n\nDog items: ");
        System.out.println("The size of the stack is: " + dogStack.stringSize());
        System.out.println("Is the stack empty? " + dogStack.isEmpty());

        dogStack.pushItem("poodle");
        dogStack.pushItem("retriever");
        dogStack.pushItem("beagle");

        System.out.println("Dog items: " + dogStack.showStack());

        System.out.println("Popped dog item: " + dogStack.popItem());
        System.out.println("dog items: " + dogStack.showStack());
        System.out.println("The size of the stack is: " + dogStack.stringSize());
        System.out.println("Is the stack empty? " + dogStack.isEmpty());
        System.out.println("the top dog is: " + dogStack.peekItem());
        System.out.println("Emptying the stack ...");
        dogStack.clearStack();
        System.out.println("The size of the stack is: " + dogStack.stringSize());
        System.out.println("Is the stack empty? " + dogStack.isEmpty());

        System.out.println("\nDone! :)");
    
    }

  }