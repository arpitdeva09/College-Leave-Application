// USERNAME :- admin

// PASSWORD :- 1234


import java.awt.Font;
import javax.swing.*;
import javax.swing.JPasswordField;

public class UserLoginForm {
    public static void main(String[] args){

        JFrame f= new JFrame("Login");


        JLabel l= new JLabel("Student Login");


        // Dimensions for "Student Login"
        l.setBounds(80, 50, 300, 25);
        l.setFont(new Font("Tahoma",Font.BOLD,22));


        // This informs the user to write their Username
        JLabel l1= new JLabel("Username");


        // Dimension and Font Style of Username
        l1.setBounds(50, 100, 120, 25);
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));


        // This is textField to Input Username
        JTextField t1= new JTextField();


        // Dimension of Username's TextField
        t1.setBounds(145, 100, 120, 25);


        // This informs the user to write their Password
        JLabel l2= new JLabel("Password");


        // Dimension and Font style of Password
        l2.setBounds(50, 150, 120, 25);
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));


        // This is textField to input Password
        JPasswordField t2= new JPasswordField();


        // TextField for Password
        t2.setBounds(145, 150, 120, 25);


        // This is the Submit Button for going to Next Page
        JButton b=new JButton("Submit");


        // Dimension and Font style of Submit Button
        b.setBounds(125, 210, 80, 30);
        b.setFont(new Font("Tahoma", Font.BOLD, 12));

        b.addActionListener(e -> {

            String username = t1.getText().trim();
            String password = new String(t2.getPassword());

            // Demo login credentials
            if (username.equals("admin") &&
                    password.equals("1234")) {

                // Open LeaveForm
                LeaveForm.main(null);

                // Close Login window
                f.dispose();

            } else {

                JOptionPane.showMessageDialog(
                        f, "Invalid Username or Password!"
                );

            }
        });


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
