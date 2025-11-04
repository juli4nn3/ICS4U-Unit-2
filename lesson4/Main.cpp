#include <iostream>
#include <vector>
#include "JuliStack.cpp"
using namespace std;

int main() {
  // this method uses the JuliStack class

  // fruit stack

  JuliStack fruitStack;

  cout << "\n\n\nFruit items: ";
  cout << "\nThe size of the stack is: " << fruitStack.stringSize();
  cout << "\nIs the stack empty? " << fruitStack.isEmpty();

  fruitStack.pushItem("apple");
  fruitStack.pushItem ("banana");
  fruitStack.pushItem("cherry");

  cout << "\nFruit items: " << fruitStack.showStack();
  cout << "\nPopped fruit item: " << fruitStack.popItem();
  cout << "\nFruit items: " << fruitStack.showStack();
  cout << "\nThe size of the stack is: " << fruitStack.stringSize();
  cout << "\nIs the stack empty? " << fruitStack.isEmpty();
  cout << "\nThe top fruit is: " << fruitStack.peekItem();
  cout << "\nEmptying the stack ...";
  fruitStack.clearStack();
  cout << "\nThe size of the stack is: " << fruitStack.stringSize();
  cout << "\nIs the stack empty? " << fruitStack.isEmpty();

  // colour stack
  
  JuliStack colourStack;

  cout << "\n\n\nColour items: ";
  cout << "\nThe size of the stack is: " << colourStack.stringSize();
  cout << "\nIs the stack empty? " << colourStack.isEmpty();

  colourStack.pushItem("red");
  colourStack.pushItem ("green");
  colourStack.pushItem("blue");

  cout << "\nColour items: " << colourStack.showStack();
  cout << "\nPopped colour item: " << colourStack.popItem();
  cout << "\nColour items: " << colourStack.showStack();
  cout << "\nThe size of the stack is: " << colourStack.stringSize();
  cout << "\nIs the stack empty? " << colourStack.isEmpty();
  cout << "\nThe top colour is: " << colourStack.peekItem();
  cout << "\nEmptying the stack ...";
  colourStack.clearStack();
  cout << "\nThe size of the stack is: " << colourStack.stringSize();
  cout << "\nIs the stack empty? " << colourStack.isEmpty();

  // dog stack

  JuliStack dogStack;

  cout << "\n\n\nDog items: ";
  cout << "\nThe size of the stack is: " << dogStack.stringSize();
  cout << "\nIs the stack empty? " << dogStack.isEmpty();

  dogStack.pushItem("poodle");
  dogStack.pushItem ("retriever");
  dogStack.pushItem("beagle");

  cout << "\nDog items: " << dogStack.showStack();
  cout << "\nPopped dog item: " << dogStack.popItem();
  cout << "\nDog items: " << dogStack.showStack();
  cout << "\nThe size of the stack is: " << dogStack.stringSize();
  cout << "\nIs the stack empty? " << dogStack.isEmpty();
  cout << "\nThe top dog is: " << dogStack.peekItem();
  cout << "\nEmptying the stack ...";
  dogStack.clearStack();
  cout << "\nThe size of the stack is: " << dogStack.stringSize();
  cout << "\nIs the stack empty? " << dogStack.isEmpty();


  return 0;
};
