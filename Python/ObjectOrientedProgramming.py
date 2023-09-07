class School:
    pass
s1 = School()
s2 = School()
s3 = School()

print(id(s1))        #this prints the address of the object created of class
print(id(s2))
print(id(s3))



class First:
    def __init__(self, num1, num2):          #this is a special method called constructor
        self.num1 = num1
        self.num2 = num2

    def Method(self):
        print("This is from Method function")
        print("The given numbers are:"+self.num1+" "+self.num2+" ")

obj1 = First("10", "12", )       #object is created and parameters are passed
obj1.Method()

obj2 = First("20", "14")
obj2.Method()



class School:
    def __init__(self):
        self.name="Harshita"
        self.age=20
    
    def update(self):
        self.age=30
    def compare(self, other):
        if(self.age == other.age):
            return True
        else:
            return False

s1=School()
s2=School()

s1.age = 12
s1.name="Krisha"

print(s1.name)
print(s1.age)

s1.update() 
print(s1.age," ", s2.age)

print(s1.compare(s2)) 