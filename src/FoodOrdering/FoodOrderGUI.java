package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae;
    private JRadioButton rbNone, rb5, rb10, rb15;
    private JButton btnOrder;

    private List<JRadioButton> bgDiscounts;

    public FoodOrderGUI() {
        super("Food Ordering System");
        bgDiscounts = new ArrayList<>();
        bgDiscounts.add(rbNone);
        bgDiscounts.add(rb5);
        bgDiscounts.add(rb10);
        bgDiscounts.add(rb15);
        ButtonGroup bg = new ButtonGroup();
        for (JRadioButton rb : bgDiscounts) {
            bg.add(rb);
        }
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

                //discount calculation
                double discount = 0;
                for (JRadioButton rb : bgDiscounts) {
                    if (rb.isSelected()) {
                        if(rb.getText().equals("None")) {
                            discount = 0;
                        } else if (rb.getText().equals("5% Off")) {
                            discount = 0.05;
                        } else if (rb.getText().equals("10% Off")) {
                            discount = 0.1;
                        } else if (rb.getText().equals("15% Off")) {
                            discount = 0.15;
                        }
                        break;
                    }
                }

                try {
                    //final price
                    double finalPrice = total - (total * discount);
                    JOptionPane.showMessageDialog(null, "The total price is Php " + String.format("%.2f", finalPrice));
                }
                catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "Error: " + error.getMessage());
                }

            }
        });
    }

    public static void main(String[] args) {
        FoodOrderGUI frame = new FoodOrderGUI();
        frame.setContentPane(frame.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 700);
        frame.setVisible(true);
    }
}


