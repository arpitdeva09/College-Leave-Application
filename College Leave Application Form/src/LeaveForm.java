import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;


public class LeaveForm {
    public static void main(String[] args){
        JFrame f= new JFrame("Application Form");


        JLabel l= new JLabel("Student Leave Application");
        l.setBounds(155, 1, 600, 70);
        l.setFont(new Font("Arial Black", Font.BOLD, 25));
        l.setForeground(new Color(35, 40, 59));


        JLabel l0= new JLabel("Please fill out this form to submit your formal leave request");
        l0.setBounds(175, 60, 600, 17);
        l0.setForeground(new Color(171, 171, 171));


        // Inform the user to write their Full Name
        JLabel l1= new JLabel("Full Name");
        l1.setBounds(40, 100, 100, 25);
        l1.setFont(new Font("Arial", Font.BOLD, 15));


        // This is TextField to Input Full Name
        JTextField t1= new JTextField();
        t1.setBounds(40, 130, 200, 25);
        t1.setFont(new Font("Arial", Font.BOLD, 15));


        // Informs the user to write their Roll Number
        JLabel l2= new JLabel("Roll Number");
        l2.setBounds(400, 100, 100, 25);
        l2.setFont(new Font("Arial", Font.BOLD, 15));


        // This is TextField to Input Roll Number
        JTextField t2= new JTextField();
        t2.setBounds(400, 130, 200, 25);
        t2.setFont(new Font("Arial", Font.BOLD, 15));


        // Informs to Select their Department / Course
        JLabel l3= new JLabel("Department / Course");
        l3.setBounds(40, 170, 200, 25);
        l3.setFont(new Font("Arial", Font.BOLD, 15));


        // Department Options
        JComboBox<String> c1;
        String[] departments = {
                "Select Department",
                "Computer Science Engineering",
                "Civil Engineering",
                "Mechanical Engineering",
                "Electrical Engineering"
        };
        c1= new JComboBox<>(departments);
        c1.setBounds(40, 200, 200, 25);


        // Informs to Select their Semester
        JLabel l4= new JLabel("Semester");
        l4.setBounds(400, 170, 200, 25);
        l4.setFont(new Font("Arial", Font.BOLD, 15));


        // Semester Option
        JComboBox<String> c2;
        String[] semester = {
                "Select Semester",
                "Semester 1",
                "Semester 2",
                "Semester 3",
                "Semester 4",
                "Semester 5",
                "Semester 6",
                "Semester 7",
                "Semester 8"
        };
        c2= new JComboBox<>(semester);
        c2.setBounds(400, 200, 200, 25);


        // Informs to select Leave Type
        JLabel l5= new JLabel("Type of Leave");
        l5.setBounds(40, 240, 200, 25);
        l5.setFont(new Font("Arial", Font.BOLD, 15));


        // Leave Type Options
        JComboBox<String> c3;
        String[] leave = {
                "Select Leave Type",
                "Medical Leave (Sick)",
                "Casual Leave / Personal",
                "Academic Leave (Duty/Seminar)",
                "Other",
        };
        c3= new JComboBox<>(leave);
        c3.setBounds(40, 270, 610, 25);


        // Informs to mention Leave Starting Date of Leave
        JLabel l6= new JLabel("From Date(dd-mm-yyyy)");
        l6.setBounds(42, 310, 170, 25);
        l6.setFont(new Font("Arial", Font.BOLD, 15));


        // TextField to input Starting Date of Leave
        JTextField t6= new JTextField();
        t6.setBounds(40, 340, 200, 25);
        t6.setFont(new Font("Arial", Font.BOLD, 15));


        // Informs to input End date of Leave
        JLabel l7= new JLabel("To Date(dd-mm-yyyy)");
        l7.setBounds(400, 310, 170, 25);
        l7.setFont(new Font("Arial", Font.BOLD, 15));


        // TextField to input End Date of Leave
        JTextField t7= new JTextField();
        t7.setBounds(400, 340, 200, 25);
        t7.setFont(new Font("Arial", Font.BOLD, 15));


        // Informs to input Reason
        JLabel l8= new JLabel("Reason");
        l8.setBounds(40, 370, 80, 25);
        l8.setFont(new Font("Arial", Font.BOLD, 16));


        // Text Area to input your Reason
        TextArea ta= new TextArea("",5,30, TextArea.SCROLLBARS_VERTICAL_ONLY);
        ta.setBounds(40, 400, 600, 200);
        ta.setFont(new Font("Arial", Font.BOLD, 18));


        // Button to Clear all Information in form
        JButton b1= new JButton("Reset");
        b1.setBounds(150, 650, 80, 30);
        b1.setFont(new Font("Arial", Font.BOLD, 15));


        // Button to Save your form in database
        JButton b2= new JButton("Submit");
        b2.setBounds(430, 650, 90, 30);
        b2.setFont(new Font("Arial", Font.BOLD, 15));


        // These all use to add all Label, TextField, Buttons, Textarea etc...
        f.add(l); f.add(l0);
        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(c1);
        f.add(l4); f.add(c2);
        f.add(l5); f.add(c3);
        f.add(l6); f.add(t6);
        f.add(l7); f.add(t7);
        f.add(l8); f.add(ta);
        f.add(b1); f.add(b2);


        // This is the Dimension of your form application
        f.setSize(700, 800);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
