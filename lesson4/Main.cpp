#include <iostream>
#include <vector>
#include "JuliStack.h"
using namespace std;

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
