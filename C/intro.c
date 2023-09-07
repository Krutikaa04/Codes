//hello world program
#include <stdio.h>
int main () {
    printf("Hello World");
    return 0;
}

//data types 
int, long - integers
float, double - decimals
char - characters
string - strings
(for strings use string.h header file in include)

//operators
//various types
1- arithmetic operators  (+, -, /, %, *)
2- logical operators     (&& --> (AND),  || --> (OR),   ! --> (NOT)  )
3- conditional operators      (>, <, <=, >=)
4- assignment operators     (=, +=, -=, /=, %= )
5- bitwise operators......etc

//example
#include <stdio.h>
int main () {
int a , b , sum;
printf("Enter first number:");
scanf("%d", &a);
printf("Enter second number:");
scanf("%d", &b);
sum = a + b;
printf("Sum is %d", sum);
return 0;
}
