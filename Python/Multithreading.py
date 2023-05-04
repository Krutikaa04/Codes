# In multithreading thread is a light-weight process. It is beneficial for acheiving multitasking.

# CPU has multi-core processor. It helps to do multiple tasks in different cores.

from time import sleep
from threading import *
class FirstProgram(Thread):
    def run(self):
        for i in range(6):
            print("Hello!")
            sleep(3)        #the thread will run with 3 sec difference

class SecondProgram(Thread):
    def run(self):
        for i in range(6):
            print("How are you?")
            sleep(3)

obj1 = FirstProgram()       #objects are created
obj2 = SecondProgram()

obj1.start()      #this will start the thread
obj2.start()

obj1.join()
obj2.join()

print("Thankyou!")