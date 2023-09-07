Inheritance is of 3 types in java
-->1)Simple Inheritance
   2)Multilevel Inheritance
   3)Hybrid Inheritance

--->NOTE: Java does not support multiple inheritance.
          For that purpose concept of Interface is used in Java.

//example of inheritance

import java.io.*;
import java.lang.*;
import java.util.*;

class GrandDad {
   public void func1() {
   System.out.println("This is function 1 from GrandDad class");
   }
}
class Dad extends GrandDad {
   public void func2() {
      System.out.println("This is function 2 from Dad class");
   }
}
class Uncle extends GrandDad {
   public void func3() {
      System.out.println("This is function 3 from Uncle class");
   }
}
class Son extends Dad {
   public void func4() {
      System.out.println("This is function 4 from Son class");
   }
}
class Cousin extends Uncle {
   public void func5() {
      System.out.println("This is function 5 from Cousin class");
   }
}
class Inheritance {
   public static void main(String[] args) {
      Son obj1 = new Son();
      Cousin obj2 = new Cousin();
      obj1.func1();
      obj1.func2();
      obj1.func4();
      System.out.println();
      obj2.func1();
      obj2.func3();
      obj2.func5();
   }
}