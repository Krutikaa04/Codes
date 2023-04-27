#example of exception
a = 12
b = 0    #in this case exception is executed
#b = 6    in this case no exception occured so after answer the finally block gets executed
try:
    print(a/b)
except Exception as e:
    print("An exception has occurred. Please check the code")
finally:
    print("Your code is executed.Thankyou.")




#example 2
try:
     x = int(input("Enter first number:"))
     y = int(input("Enter second number:"))
     ans = x/y
     print(ans)
except ZeroDivisionError:
     print("Zero Division Error has occurred.")
except Exception as e:
     print("An error occurred.", e)
finally:
     print("Your code is executed. Bye")



#example to create your own exception
class Error(Exception):
    pass
class VoteException(Error):          #new exception created
    pass

age = int(input("Enter your age as of 2023: "))
try:
    if(age>=18):
        print("You are eligible to vote")
    else:
        raise VoteException
except VoteException:
    print("This is an exception as you are not eligible to vote")