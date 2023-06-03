import java.io.*;
import java.lang.*;
import java.util.*;

class BuffereReader {
    public static void evenLooping() {
        for(int i = 1; i<=20; i++) {
            if(i%2!=0) {
                continue;
            }
            if(i>10) {
                break;
            }
            System.out.println("Value is - "+i);
        }
    }

    public static void nestedLoop() {
        for(int i = 1; i<=10; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a, b;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        if(a > b) {
            System.out.println(" "+a+" is greater than"+" "+b);
        }
        else {
            System.out.println(" "+b+" is greater than"+" "+a);
        }
        evenLooping();
        nestedLoop();
    }


}