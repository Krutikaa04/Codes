#include <iostream>
#include <string>
using namespace std;
class Vehicle {        
  public:          
    char brand;  
    char model;  
    int year;     
    
    Vehicle(char x, char y, int z) {  // Constructor with passing 3 parameters
      brand = x;
      model = y;
      year = z;
    }

    void function1(){
      cout<<"\nInside Function";
    }
};

// Constructor definition outside the class

    Vehicle::Vehicle(string x, string y, int z) {
        brand = x;
        model = y;
        year = z;
} 

void main() {
//constructor is called by giving values 
  Vehicle obj1('K', 'W', 2004);
  Vehicle obj2('I', 'M', 2019);

  obj1.function1();
  cout << obj1.brand << " " << obj1.model << " " << obj1.year << "\n";
  cout << obj2.brand << " " << obj2.model << " " << obj2.year << "\n";
}
