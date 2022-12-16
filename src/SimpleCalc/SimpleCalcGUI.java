package SimpleCalc;

import javax.swing.*;

public class SimpleCalcGUI {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton cbCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public static void main(String[] args) {
        JFrame frame = new JFrame("SimpleCalcGUI");
        frame.setContentPane(new SimpleCalcGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
