package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1,tfNumber2;
    private JComboBox cbOperations;
    private JButton cbCompute;
    private JTextField lblResult;

    public SimpleCalcGUI() {
        lblResult.setEditable(false);
        //Operations
        cbOperations.addItem("+");
        cbOperations.addItem("-");
        cbOperations.addItem("*");
        cbOperations.addItem("/");
        cbCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //exception handling
                try {
                    int tf1 = Integer.parseInt(tfNumber1.getText());
                    int tf2 = Integer.parseInt(tfNumber2.getText());
                    String operation = cbOperations.getSelectedItem().toString();
                    int result = 0;
                    switch (operation) {
                        case "+":
                            result = tf1 + tf2;
                            break;
                        case "-":
                            result = tf1 - tf2;
                            break;
                        case "*":
                            result = tf1 * tf2;
                            break;
                        case "/":
                            result = tf1 / tf2;
                            break;
                    }
                    lblResult.setText(String.valueOf(result));

                } catch (ArithmeticException ex) {
                    lblResult.setText("Arithmetic Exception");
                }
                catch (NumberFormatException ex) {
                    lblResult.setText("Number Format Exception");
                }
                catch (NullPointerException ex) {
                    lblResult.setText("Null Pointer Exception");
                }
                catch (Exception ex) {
                    lblResult.setText("Error, Try again");
                }
            }
        });


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setContentPane(new SimpleCalcGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        frame.setVisible(true);
    }
}
