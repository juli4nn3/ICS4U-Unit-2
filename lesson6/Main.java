
/*
 * This program uses the JuliStack class.
 *
 * @author  Julianne Leblanc-Peltier
 * @version 1.0
 * @since   Oct 30, 2025
 */

 /**
  * This program uses the Stack.
  */
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

        FruitStack fruit = new FruitStack();

        System.out.println("Fruit items: " + fruit.showStack());

        // colour stack

        JuliStack colourStack = new JuliStack();

        colourStack.pushItem("red");
        colourStack.pushItem("green");
        colourStack.pushItem("blue");

        System.out.println("Colour items: " + colourStack.showStack());

        // dog stack

        JuliStack dogStack = new JuliStack();

        dogStack.pushItem("poodle");
        dogStack.pushItem("retriever");
        dogStack.pushItem("beagle");

        System.out.println("Dog items: " + dogStack.showStack());

        System.out.println("\nDone! :)");
    }
}