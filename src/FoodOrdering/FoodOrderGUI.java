package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae;
    private JRadioButton rbNone, rb5, rb10, rb15;
    private JButton btnOrder;

    public FoodOrderGUI() {
        super("Food Ordering System");
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = 0;

                //price
                if (cPizza.isSelected()) {
                    total += 100;
                }
                if (cBurger.isSelected()) {
                    total += 80;
                }
                if (cFries.isSelected()) {
                    total += 65;
                }
                if (cSoftDrinks.isSelected()) {
                    total += 55;
                }
                if (cTea.isSelected()) {
                    total += 50;
                }
                if (cSundae.isSelected()) {
                    total += 40;
                }
                if (rb5.isSelected()) {
                    total += 5;
                }
                if (rb10.isSelected()) {
                    total += 10;
                }
                if (rb15.isSelected()) {
                    total += 15;
                }

                //discount calculation
                if (rbNone.isSelected()) {
                    total += 0;
                } else if (rb5.isSelected()) {
                    total = total - (total * 0.05);
                } else if (rb10.isSelected()) {
                    total = total - (total * 0.1);
                } else if (rb15.isSelected()) {
                    total = total - (total * 0.15);
                }
                JOptionPane.showMessageDialog(null, "The total price is Php " + total);
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderGUI frame = new FoodOrderGUI();
        frame.setContentPane(frame.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}


