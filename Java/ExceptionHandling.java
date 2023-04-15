//try....catch
//throw
//finally

//types of exceptions:-
//1)Arithmetic Exception
//2)ArrayOutOfBound Exception
//3)FileNotFound Exception


import java.io.*;
import java.lang.*;
import java.util.*;

class ExceptionHandling {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first value:");
            int x = sc.nextInt();
            System.out.println("Enter second value:");
            int y = sc.nextInt();
            if(y == 0) {
                throw new ArithmeticException ("Division by 0 is not possible");
            }
            int quotient = x / y;
            System.out.println("Answer is:"+quotient);
        }
        catch (Exception e) {
            System.out.println("An exception ocurred "+e);
        }
        finally {
            System.out.println("Finally block has been executed");
        }
    }
}
