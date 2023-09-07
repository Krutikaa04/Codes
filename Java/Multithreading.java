import java.io.*;
import java.lang.*;
import java.util.*;

class First extends Thread {             //Thread is a predefined class
    public void run() {       
        int i;
        for(i=1; i<=5; i++) {
            System.out.println("First Thread: "+i);
            try {
                sleep(3000);            //there will be a gap of 3 secs during execution of loop
            }catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}
class Second extends Thread {
    public void run() {
        int i;
        for(i=1; i<=5; i++) {
            System.out.println("Second Thread: "+i);
            try {
                sleep(3000);
            }catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}
class Multithreading {
    public static void main(String[] args) {
        First t1 = new First();
        Second t2 = new Second();
        t1.start();          //start is a predefined function
        t2.start();
    }
}
