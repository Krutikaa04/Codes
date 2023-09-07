//hello world program in cpp

#include <iostream.h>

void main() {
    cout<<"Hello World";
}


//data types
int, float, char, string 
int --4 bytes
float --4 bytes
char --1 byte
double --8 bytes
long --8 bytes


//operators 
relational, arithmetic, conditional, bitwise..etc

//example

#include <iostream.h>

int main() {
    int a , b , sum , diff , mod;
    cout <<"Enter first number:";
    cin >> a;
    cout <<"Enter second number:";
    cin >>b;
    sum = a + b;
    diff = a - b;
    mod = a % b;
    cout<<"Sum is :"<<" "<<sum;
    cout<<"Difference is :"<<" "<<diff;
    cout<<"Modulus is :"<<" "<<mod;
    return 0;
    }
