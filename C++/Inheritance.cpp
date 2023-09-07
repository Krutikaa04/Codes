Types of inheritance -->
1) simple inheritance  -- //child class inherited from parent class is example of simple inheritance
2) multiple inheritance -- //child class inherited from more than one parent class is example of multiple inheritance
3) multilevel inheritance -- //parent --> child --> grandchild is an example of multilevel inheritance
4) hybrid inheritance


//example of inheritance
#include<iostream>
using namespace std;

class Parent {
    public:
    void func1() {
        cout<<"\nThis is function 1 from parent class";
    }
};
class Child : public Parent {
    public:
    void func2() {
        cout<<"\nThis is function 2 from Child class";
    }
};
class Grandchild : public Child {
    public:
     void func3() {
        cout<<"\nThis is function 3 from Grandchild class";
    }
};
int main() {
    Grandchild obj1;
    Child obj2;
    obj1.func1();
    obj1.func2();
    obj1.func3();
    cout<<"\n";
    obj2.func1();
    obj2.func2();
    return 0;
}