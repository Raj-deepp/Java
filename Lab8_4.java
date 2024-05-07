import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Lab8_4 extends JFrame {
    private JTextField firstNumberField, secondNumberField, resultField;
    public Lab8_4() {
        createUI();
    }
    private void createUI() {
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 1, 5, 5));
        setSize(300, 400);

        // Labels and Text Fields
        add(new JLabel("Enter the First Number:"));
        firstNumberField = new JTextField();
        add(firstNumberField);
        add(new JLabel("Enter the Second Number:"));
        secondNumberField = new JTextField();
        add(secondNumberField);
        add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        // Buttons
        addButton("Add", (e) -> performOperation('+'));
        addButton("Subtract", (e) -> performOperation('-'));
        addButton("Multiply", (e) -> performOperation('*'));
        addButton("Divide", (e) -> performOperation('/'));
        addButton("Percentage", (e) -> performOperation('%'));
        addButton("Modulus", (e) -> performOperation('m'));
        addButton("Power", (e) -> performOperation('p'));
        addButton("Reset", (e) -> resetFields());
    }

    private void addButton(String label, ActionListener actionListener) {
        JButton button = new JButton(label);
        button.addActionListener(actionListener);
        add(button);
    }

    private void performOperation(char operation) {
        try {
            double num1 = Double.parseDouble(firstNumberField.getText());
            double num2 = Double.parseDouble(secondNumberField.getText());
            double result = 0;
            switch (operation) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
                case '%': result = (num1 / num2) * 100; break;
                case 'm': result = num1 % num2; break;
                case 'p': result = Math.pow(num1, num2); break;
            }

            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            resultField.setText("Invalid Input");
        } catch (ArithmeticException e) {
            resultField.setText("Error");
        }
    }
    private void resetFields() {
        firstNumberField.setText("");
        secondNumberField.setText("");
        resultField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Lab8_4 calculator = new Lab8_4();
            calculator.setVisible(true);
        });
    }
}