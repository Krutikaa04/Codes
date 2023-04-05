OOP --> OOP stands for Object Oriented Programming
eg. Python, Java, c++, c#, etc are Object Oriented Programming languages.
1) class
2) object
3) functions

access specifiers -->
1) public : public class variables can be used even outside its own class
2) protected : protected class variables can be used only in its own class and subclasses of the class respectively
3) private : private class variables can be only accessed by the class.

a class can have one or more functions, they are directly called in the main class by creating objects of the class.


//example to classes and object
#include<iostream>
using namespace std;
class Number {    //class name
    public:     //acess specifier
    void addition() {  //function
    int num1, num2, sum;
    cout<<"Enter first number:";
    cin>>num1;
    cout<<"\nEnter second number:";
    cin>>num2;
    sum = num1 + num2;
    cout<<"\nSum is :"<<" "<<sum;
    }
};
int main() {
    Number n1;  //object is made
    n1.addition();   //function is called with the object made
    return 0;
}