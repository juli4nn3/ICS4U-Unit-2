
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
     * This class defines a JuliStack string stack.
     * 
     * @param args No args will be used.
     */

    private ArrayList<String> stackAsList = new ArrayList<String>();

    /**
     * this method adds a number to the list.
     * 
     * @param pushedString
     */
    public void pushItem(String pushedString) {
        stackAsList.add(pushedString);
    }

    /**
     * this method removes & returns the last value in the list.
     * 
     * @return itemPopped
     */
    public String popItem() {
        String itemPopped = "";

        if (stackAsList.isEmpty()) {
            itemPopped = "Error! Stack is empty!";
        } else {
            itemPopped = stackAsList.get(stackAsList.size() - 1);
            stackAsList.remove(stackAsList.size() - 1);
        }

        return itemPopped;
    }

    /**
     * this method returns the stack as a string.
     * 
     * @return stackValues
     */
    public String showStack() {
        // variables
        String stackValues = "";
        // creates string of stackAsList without square brackets
        if (stackAsList.isEmpty()) {
            stackValues = "Error! Stack is empty!";
            } else {
                for (int value = 0; value < stackAsList.size(); value++) {
                    stackValues = stackValues + stackAsList.get(value) + ", ";
            }
        }

        return stackValues;
    }
    
    /**
     * This method determines whether the stack is empty.
     * @return stackIsEmpty
     */
     public boolean isEmpty() {
        boolean stackIsEmpty;

        if (stackAsList.size() == 0) {
            stackIsEmpty = true;
        } else {
            stackIsEmpty = false;
        }

        return stackIsEmpty;
    }

    /**
     * This method calculates the size of string.
     * @return sizeOfString
     */
    public int stringSize() {
        int sizeOfString = stackAsList.size();

        return sizeOfString;
    }
}
