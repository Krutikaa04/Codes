//A class does not have to provide implementations for all methods.
//When this is the case a class  can provide partial implementations of the implemented interfaces.
//If a class does not provide the full implementation of interfaces, it must be declared abstract.

import java.io.*;
import java.lang.*;
import java.util.*;

interface Method1 {
    public void num();
    public void num1();
    public void num2();
}

abstract class Method2 implements Method1 {
    public void num() {
         System.out.println("Here only num method is implemented");     //here only 1 method is executed from interface
       
    }
}

class Method3 extends Method2 {
    public void num1() {
         System.out.println("Here num1 method is implemented");    //here rest of the methods are executed
    }
    public void num2(){
         System.out.println("Here num2 method is implemented");
    }
}

class PartialImplementation extends Method3 {
    public static void main(String[] args) {
        PartialImplementation obj = new PartialImplementation();
        obj.num();
        obj.num1();
        obj.num2();
    }
}