import java.applet.*;
public class AppletsInJava extends Applet {
    public void init() {
        System.out.println("This is from init function");
    }
    public void start() {
        System.out.println("This is from start function");
    }
    public void stop() {
        System.out.println("This is from stop function");
    }
    public void destroy() {
        System.out.println("This is from destroy function");
    }
    
}
