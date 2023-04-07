1) if...else
2)if....else if...else
3)switch case

//example...grading system
import java.io.*;
import java.lang.*;
import java.util.*;
class Grade {
    public void marks() {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter marks: ");
        int n = sc.nextInt();
        if(n>=90) {
            System.out.println("Grade A+");
        }
        else if(n<90 && n>=75) {
             System.out.println("Grade A");
        }
        else if(n<75 && n>=50) {
             System.out.println("Grade B");
        }
        else if(n<50 && n>=35) {
             System.out.println("Grade C");
        }
        else {
            System.out.println("Fail");
        }
    }
}
class Loops {
    public static void main(String[] args) {
        Grade obj = new Grade();
        obj.marks();
    }
}

---> switch case
int n =1;
switch(n) {
    case 1:
        //code
        break;     
    case 2:
        //code
        continue;
    case 3:
        //code
        break;
    default:
        //code
        break;
}



Loops -->for, while, do-while
1) for loop
   for(condition) {
    //code
   }

2)while loop
   initialization
   while(condition) {
      //code
   }

3)do-while loop
   initialization
   do{
    //code
   }
   while(condition);