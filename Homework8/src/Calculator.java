import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator extends JFrame {
    public Calculator() {
        setTitle("Calculator");
        getContentPane().add(new CalculatorPanel());
    }
    public static void main(String[] args) {
        Calculator frame = new Calculator();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.setVisible(true);
    }
}
class CalculatorPanel extends JPanel {
// Шрифт и размер цифр для кнопок
    Font Font1 = (new Font("Arial", Font.BOLD, 26));
    private JLabel display;
    private JPanel panel;
    private double result;
    private String lastCommand;
    private boolean start;
    public CalculatorPanel() {
        setLayout(new BorderLayout());
        result = 0;
        lastCommand = "=";
        start = true;
//Параметры окна вывода результата
        display = new JLabel("0");
        display.setPreferredSize(new Dimension(400, 100));
        display.setBorder(new EmptyBorder(0,0,0,20));
        add (display, BorderLayout.NORTH);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(Font1);
        ActionListener insert = new InsertAction();
        ActionListener command = new CommandAction();
        ActionListener clear = new ClearAction();
        panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setLayout(new GridLayout(4, 4));
        addButton("7", insert);
        addButton("8", insert);
        addButton("9", insert);
        addButton1("/", command);
        addButton("4", insert);
        addButton("5", insert);
        addButton("6", insert);
        addButton1("*", command);
        addButton("1", insert);
        addButton("2", insert);
        addButton("3", insert);
        addButton1("-", command);
        addButton(".", insert);
        addButton("0", insert);
        addButton("=", command);
        addButton1("+", command);
        addButton2("C", clear);
        add(panel, BorderLayout.CENTER);
    }
   public void addButton(String label, ActionListener listener) {
        JButton button = new JButton(label);
        button.addActionListener(listener);
        panel.add(button, BorderLayout.CENTER);
        button.setForeground(Color.blue);
        button.setBackground(Color.orange);
        button.setFont(Font1);
    }
    public void addButton1(String label, ActionListener listener) {
        JButton button1 = new JButton(label);
        button1.addActionListener(listener);
        panel.add(button1, BorderLayout.CENTER);
        button1.setForeground(Color.blue);
        button1.setBackground(Color.orange);
        button1.setFont(Font1);
// Всплывающие подсказки для конопок
        button1.setToolTipText ("Операция с числом");
    }
    public void addButton2(String label, ActionListener listener) {
        JButton button2 = new JButton(label);
        button2.addActionListener(listener);
        add(button2, BorderLayout.SOUTH);
        button2.setForeground(Color.blue);
        button2.setBackground(Color.orange);
        button2.setFont(Font1);
        button2.setToolTipText ("Очистить поле ввода");
    }
    private class InsertAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String input = event.getActionCommand();
            if (start) {
                display.setText("");
                start = false;
            }
            display.setText(display.getText() + input);
        }
    }
    private class ClearAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
                        display.setText("0");
        }
    }
    private class CommandAction implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            String command = evt.getActionCommand();
            if (start) {
                if (command.equals("-")) {
                    display.setText(command);
                    start = false;
                } else
                    lastCommand = command;
            } else {
                calculate(Double.parseDouble(display.getText()));
                lastCommand = command;
                start = true;
            }
        }
    }
    public void calculate(double x) {
        switch (lastCommand) {
            case "+":
                result += x;
                break;
            case "-":
                result -= x;
                break;
            case "*":
                result *= x;
                break;
            case "/":
                result /= x;
                break;
            case "=":
                result = x;
                break;
        }
        display.setText("" + result);
    }
}
