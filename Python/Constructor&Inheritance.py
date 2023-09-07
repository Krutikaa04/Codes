# a variable that is defined inside init method is called ---> instance variable
# a variable that is defined outside init method but inside class is called ---> class variable

class Parent:
    def Function1(self):
        print("This is from function 1 of Parent class")

    def Function2(self):
        print("This is from function 2 of Parent class")

class Child(Parent):     #this class is inherited from parent class
    def Function3(self):
        print("This is from function 3 of Child class")

    def Function4(self):
        print("This is from function 3 of Child class")

obj1 = Child()
obj1.Function1()
obj1.Function3()



#this is constructor inheritance
class Parent:
    def __init__(self):         #init constructor created
       print("This is from Class Parent")

    def Function1(self):
        print("This is from function 1 of Parent class")

    def Function2(self):
        print("This is from function 2 of Parent class")


class Child(Parent):      #this class is inherited from parent class
    def __init__(self):
        super().__init__()             #constructor is inherited from Parent class
        print("This is from Class Child")

    def Function3(self):
        print("This is from function 3 of Child class")

    def Function4(self):
        print("This is from function 3 of Child class")

obj1 = Child()
obj1.Function2()
obj1.Function4()



#constructor inheritance with Multiple Inheritance
#Multiple resolution order ( MRO )

class Parent1:
    def __init__(self):
        print("This is from Parent 1 class")

    def Function1(self):
        print("This is from function of Parent 1 class")

class Parent2:
    def __init__(self):
        print("This is from Parent 2 class")

    def Function2(self):
        print("This is from function of Parent 2 class")

class Child(Parent1, Parent2):
    def __init__(self):
        super().__init__()
        print("This is from Child class")

    def Function3(self):
        print("This is from function of Child class")

obj1 = Child()
obj1.Function1()
obj1.Function2()
obj1.Function3()
