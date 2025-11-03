#include <iostream>
#include <vector>
#include "JuliStack.h"
using namespace std;

void JuliStack::pushItem(string pushedString) {
    stackAsList.push_back(pushedString);
};

string JuliStack::showStack() {
    // this method returns the stack as a string
    string stackValues = "";

    // creates string of stackAsList without the square brackets
    for (string items : stackAsList) {
        stackValues = stackValues + items + ", ";
    }

    return stackValues;
};
