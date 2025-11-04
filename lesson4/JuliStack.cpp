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

    string showStack() {
        // this method returns the stack as a string
        string stackValues = "";

        // creates string of stackAsList without the square brackets
        for (string items : stackAsList) {
            stackValues = stackValues + items + ", ";
        }

        return stackValues;
    }
};