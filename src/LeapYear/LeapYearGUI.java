package LeapYear;

import javax.swing.*;
import java.awt.event.*;


public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year = Integer.parseInt(tfYear.getText());
                if (year % 4 != 0) {
                    JOptionPane.showMessageDialog(null, "Not a leap year");
                } else if (year % 100 != 0) {
                    JOptionPane.showMessageDialog(null, "Leap year");
                } else if (year % 400 != 0) {
                    JOptionPane.showMessageDialog(null, "Not a leap year");
                } else {
                    JOptionPane.showMessageDialog(null, "Leap year");
                }
            }
        });


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Leap Year Checker");
        frame.setContentPane(new LeapYearGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setVisible(true);
    }
}


