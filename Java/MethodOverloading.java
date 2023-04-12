import java.io.*;
import java.lang.*;
import java.util.*;

abstract class MyClass {
    public abstract void absfunc();
}
class Class1 extends MyClass{
    public void func1(int n) {
        System.out.println("This is value of func1 :"+ n);
    }
    public void func2(int n, String a) {
        System.out.println("This is value of int from func2 :"+n);
        System.out.println("This is value of string from func2 :"+a);
    }
    public void absfunc() {
        System.out.println("This is function from abstract class");
    }
}
class MethodOverloading extends Class1 {
    public static void main(String[] args) {
        Class1 obj = new Class1();
        obj.func1(12);
        obj.func2(14, "Krutika");
        obj.absfunc();
    }
} 