
/*
 * This class creates an integer stack.
 *
 * @author  Julianne Leblanc-Peltier
 * @version 1.0
 * @since   October 30, 2025
 */

import java.util.ArrayList;

public final class JuliStack {
    /**
     * This class defines a JuliStack string stack
     *
     * @param args No args will be used
     */

    ArrayList<String> stackAsList = new ArrayList<String>();

    public void pushItem(String pushedString) {
        // add a number to the list
        stackAsList.add(pushedString);
    }

    public String popItem() {
        // this method pops out the last value in the list, and returns the value
        String itemPopped = "";

        if (stackAsList.isEmpty() == true) {
            itemPopped = "Error! Stack is empty!";
        } else {
            itemPopped = stackAsList.get(stackAsList.size() - 1);
            stackAsList.remove(stackAsList.size() - 1);
        }

        return itemPopped;
    }

    public String showStack() { 
        // This method returns the stack as a string
        String stackValues = "";

        // creates string of stackAsList without square brackets 
        if (stackAsList.isEmpty() == true) { 
            stackValues = "Error! Stack is empty!"; 
        } else { 
            for (int value = 0; value < stackAsList.size(); value++) { 
                stackValues = stackValues + stackAsList.get(value) + ", "; 
            }
        }

        return stackValues; 
    }

    public boolean isEmpty() {
        boolean stackIsEmpty;

        if (stackAsList.size() == 0) {
            stackIsEmpty = true;
        } else {
            stackIsEmpty = false;
        }

        return stackIsEmpty;
    }

    public int stringSize() {
        int sizeOfString = stackAsList.size();

        return sizeOfString;
    }

    public String peekItem() {
        // this method returns the last value in the stackAsList

        String itemPeeked = "";

        if (stackAsList.isEmpty() == true) {
            itemPeeked = "Error! Stack is empty!";
        } else {
            itemPeeked = stackAsList.get(stackAsList.size() - 1);
        }

        return itemPeeked;
    }

    public void clearStack() {
        // this method removes all items in the Stack
        stackAsList.clear();
    }
}
