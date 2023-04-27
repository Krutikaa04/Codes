import java.awt.*;           
import java.awt.event.*;
class AWTControls extends Frame implements ActionListener {
    Panel p;
    TextField t1;
    TextField t2;
    TextField t3;
    Label l1;
    Label l2;
    Label l3;
    Button b;

    public AWTControls() {
        super("Calculation App");
        p = new Panel();
        add(p);

        l1 = new Label("Enter first number :");
        t1 = new TextField(20);

        l2 = new Label("Enter operator :");
        t2 = new TextField(1);

        l3 = new Label("Enter second number :");
        t3 = new TextField(20);

        b = new Button("Calculate");
        b.addActionListener(this);

        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(l3);
        p.add(t3);
        p.add(b);

        setSize(600, 600);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == b) {
            String s1 = t1.getText();
            int a = Integer.parseInt(s1);

            String s2 = t3.getText();
            int b = Integer.parseInt(s2);

            String s3 = t2.getText();
            char ch = s3.charAt(0);

            if(ch == '+') {
                int sum = a + b;
                System.out.println(sum);
            }
            else if(ch == '-') {
                int diff = a - b;
                System.out.println(diff);
            }
            else if(ch == '*') {
                int prod = a * b;
                System.out.println(prod);
            }
            else if(ch == '/' ){
                int quo = a / b;
                System.out.println(quo);
            }
            else if(ch == '%') {
                int mod = a % b;
                System.out.println(mod);
            }
            else {
                System.out.println("Not a valid operator!");
            }
        }
    }

    public static void main(String []args) {
        AWTControls obj = new AWTControls();
    }
}  