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

int main() {
  // Create an object of JuliStack
  JuliStack fruitStack;

  // pushes strings to list
  fruitStack.pushItem("apple");
  fruitStack.pushItem ("banana");
  fruitStack.pushItem("cherry");
  cout << "Fruit items: " << fruitStack.showStack() << "\n\n";

  return 0;
};
