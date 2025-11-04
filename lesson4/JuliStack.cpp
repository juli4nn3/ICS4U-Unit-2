#include <iostream>
#include <vector>
using namespace std;

// Create a JuliStack class with some attributes
class JuliStack {
  public:
    vector<string> stackAsList;

    void pushItem(string pushedString) {
        stackAsList.push_back(pushedString);
    }

    string popItem() {
        // this method pops out the last value in the list, and returns the value
        string itemPopped = "";

        itemPopped = stackAsList.back();
        stackAsList.pop_back();

        return itemPopped;
    }

    string showStack() {
        // this method returns the stack as a string
        string stackValues = "";

        // creates string of stackAsList without the square brackets
        for (string items : stackAsList) {
            stackValues = stackValues + items + ", ";
        }

        return stackValues;
    }

    string isEmpty() {
        string stackIsEmpty;

        if (stackAsList.size() == 0) {
            stackIsEmpty = "true";
        } else {
            stackIsEmpty = "false";
        }

        return stackIsEmpty;
    }

    int stringSize() {
        int sizeOfString = stackAsList.size();

        return sizeOfString;
    }

    string peekItem() {
        // this method returns the last value in the stackAsList

        string itemPeeked = "";

        int lastIndex = stackAsList.size() - 1;
        itemPeeked = stackAsList[lastIndex];

        return itemPeeked;
    }

    void clearStack() {
        // this method removes all items in the stack
        stackAsList.clear();
    }
};