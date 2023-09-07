#printing hello world in python    --->this is how comments are made in python
print("Hello World!")

#data types and variables
#Python does not require declaration of type like integer, float, string, etc.
print(1+1)       
print(10%2)
print(30 ** 2)

#You can print type of the variable as follows :-
var1 = 12
var2 = "Krutika"
var3 = 45.63

print(type(var1))
print(type(var2))
print(type(var3))


#printing length of string
print(len(var2))

name = "Krutika"
surname = "Wagh"
print("My name is {} and surname is {}.format(name, surname)")    #first method of printing
print("My name is {first} and surname is {surname}.format(first = name, last = surname)")         #alternate method

#booleans
#to check whether the given type is boolean
print(type(True))     # ==> Output- bool
print(type(False))


# logical operators  --> and, or, not
print(True and True)  #true
print(True and False) #false
print(not True)       #false
print(True or False)  #true


#taking inputs in python
#this will take input of two numbers to find sum
#arithmetic operators --> +, -, *, %, /

num1 = input("Enter first number:")
num1 = int(num1)
num2 = input("Enter second number:")
num2 = int(num2)
sum = num1 + num2
print("Sum is: ",sum)


#example --> print area of rectangle
num1 = input("Enter length of rectangle:")
num1 = float(num1)
num2 = input("Enter breadth of rectangle:")
num2 = float(num2)
area = num1 * num2
print("Area of rectangle is :", area)
