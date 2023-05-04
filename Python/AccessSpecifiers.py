# Types of Access Specifiers -->
# 1) Public  --> these type of variables can be accessed anywhere
# 2) Private --> these type of variables can be accessed only within the class where the variables are declared
# 3) Protected --> these type of variables can be accessed only within the class where the variables are declared and the subclasses of the class itself.


# define a constructor with class variable

class Details():
    def __init__(self, name, age, stream):

    # these are public variables and can be accessed anywhere

        self.name = name
        self.age = age
        self.stream = stream

student1 = Details("Rishitha", 17, "Commerce")
student2 = Details("Rishabh", 18, "Electronics")

print(student1.name," - ", student1.stream)
print(student2.name," - ", student2.stream)



# define a constructor with class variable
class Details():
    def __init__(self, name, age, stream):

    # these are protected variables and expressed with a underscore before the variable

        self._name = name
        self._age = age
        self._stream = stream

class SubDetails(Details):
    def __init__(self, name, age, stream, rollno):
        super().__init__(name, age, stream)
        self.rollno = rollno

student1 = Details("Rishitha", 19, "Arts")
print(student1._name," - ", student1._stream)


student2 = SubDetails("Rishabh", 22, "Mechanics", 143)
print(student2._name, " - ", student2._stream, " ", "rollno - ", student2.rollno)

#if you print dir of obj you will see public and private variables of the object
print(dir(student2))



# private variable defined by __ i.e. double underscore.
class Details():
    def __init__(self, name, age, stream):

        self.__name = name
        self.__age = age
        self.__stream = stream

student = Details("Rishitha", 19, "Arts")

#if you print dir of obj you will see public and private variables of the object
print(dir(student))

