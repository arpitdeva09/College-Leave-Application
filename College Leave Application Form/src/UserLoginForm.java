import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UserLoginForm {
    public static void main(String[] args){

        JFrame f= new JFrame("Login");


        JLabel l= new JLabel("Student Login");


        // This informs the user to write their Username
        JLabel l1= new JLabel("Username");


        // This is textField to Input Username
        JTextField t1= new JTextField();


        // This informs the user to write their Password
        JLabel l2= new JLabel("Password");


        // This is textField to input Password
        JTextField t2= new JTextField();


        // This is the Submit Button for going to Next Page
        JButton b=new JButton("Submit");


        // Dimensions for "Student Login"
        l.setBounds(80, 50, 300, 25);
        l.setFont(new Font("Tahoma",Font.BOLD,22));


        // Dimension and Font Style of Username
        l1.setBounds(50, 100, 120, 25);
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));


        // Dimension of Username's TextField
        t1.setBounds(145, 100, 120, 25);


        // Dimension and Font style of Password
        l2.setBounds(50, 150, 120, 25);
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));


        // TextField for Password
        t2.setBounds(145, 150, 120, 25);


        // Dimension and Font style of Submit Button
        b.setBounds(125, 210, 80, 30);
        b.setFont(new Font("Tahoma", Font.BOLD, 12));


        // These use to add all Label, TextField etc......
        f.add(l);
        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(b);


        // Dimension of the Frame or Dialog Box
        f.setSize(350, 350);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
