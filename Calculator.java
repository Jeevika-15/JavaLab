//13. Make one calculator in swing.

import javax.swing.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener {
    JTextField t1, t2, t3;
    JButton add, sub, mul, div;

    Calculator() {
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");

        t1.setBounds(50, 30, 100, 30);
        t2.setBounds(50, 70, 100, 30);
        t3.setBounds(50, 110, 100, 30);

        add.setBounds(30, 160, 50, 30);
        sub.setBounds(90, 160, 50, 30);
        mul.setBounds(30, 200, 50, 30);
        div.setBounds(90, 200, 50, 30);

        add(t1); add(t2); add(t3);
        add(add); add(sub); add(mul); add(div);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setSize(250, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int result = 0;

        if (e.getSource() == add)
            result = a + b;
        else if (e.getSource() == sub)
            result = a - b;
        else if (e.getSource() == mul)
            result = a * b;
        else if (e.getSource() == div)
            result = a / b;

        t3.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}