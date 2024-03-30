package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApplet extends JApplet implements ActionListener {
    private JTextField display;

    public void init() {
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4)); // 5 rows, 4 columns

        String[] buttonLabels = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "0", ".", "=", "/"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if ("=".equals(command)) {
            evaluateExpression();
        } else {
            display.setText(display.getText() + command);
        }
    }

    private void evaluateExpression() {
        String expression = display.getText();
        try {
            char operator = findOperator(expression);
            if (operator != '\0') {
                String[] operands = expression.split("\\Q" + operator + "\\E");
                double num1 = Double.parseDouble(operands[0]);
                double num2 = Double.parseDouble(operands[1]);
                double result = evaluate(num1, operator, num2);
                display.setText(Double.toString(result));
            } else {
                // Invalid expression
                display.setText("Error");
            }
        } catch (NumberFormatException ex) {
            // Invalid number format
            display.setText("Error");
        }
    }

    private char findOperator(String expression) {
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                return ch;
            }
        }
        return '\0'; // Operator not found
    }

    private double evaluate(double num1, char operator, double num2) {
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        return result;
    }
}
