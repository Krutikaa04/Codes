import java.io.*;


//Bytes are the input and output characters of file
//for input --> FileInputStream (for read)
//for output --> FileOutputStream (for write/append)

class FileHandling {
    public static void ReadFile() {
        FileInputStream input = null;
        int a;
        try {
            input = new FileInputStream ("SampleFile.txt");
            a = input.read();
            while(a != -1) {
                System.out.print((char)a);
                a = input.read();
            }
            input.close();
        }
        catch(Exception e) {
            System.out.println("An exception has occurred "+e);
        }

    }
    public static void WriteFile() {
        FileOutputStream output = null;
        try {
            byte b[] = {'K', 'R', 'U', 'T', 'I', 'K', 'A'};
            output = new FileOutputStream ("SampleFile.txt");
            output.write(b);
            output.close();
        }
        catch (Exception e) {
            System.out.println("An exception has occurred "+e);
        }
    }
    public static void main (String[] args) {
        FileHandling obj = new FileHandling();
        obj.ReadFile();
        obj.WriteFile();
    }
}