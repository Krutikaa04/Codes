//hello world in java

import java.io.*;
import java.lang.*;

class Intro {
  public static void main(String[] args) {
    System.out.println("Hello world");
  }
}

//data types --> int, float, char, string, array, etc


//taking inputs in java
--> taking inputs in java requires Scanner class

import java.io.*;
import java.lang.*;
import java.util.*;

class Number {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);            //scanner class
    System.out.println("Enter first number:");
    int num1 = sc.nextInt();                       //typecasting from string to integer type
    System.out.println("Enter second number:");
    int num2 = sc.nextInt();
    int sum = num1 + num2;
    System.out.println("Sum is : "+sum);
  }
}

