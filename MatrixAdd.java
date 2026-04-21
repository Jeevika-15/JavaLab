//14. Matrix Addition using swing class.

import javax.swing.*;
import java.awt.event.*;

class MatrixAdd extends JFrame implements ActionListener {
    JTextField a1, a2, a3, a4;
    JTextField b1, b2, b3, b4;
    JTextField r1, r2, r3, r4;
    JButton addBtn;

    MatrixAdd() {
        a1 = new JTextField(); a2 = new JTextField();
        a3 = new JTextField(); a4 = new JTextField();

        b1 = new JTextField(); b2 = new JTextField();
        b3 = new JTextField(); b4 = new JTextField();

        r1 = new JTextField(); r2 = new JTextField();
        r3 = new JTextField(); r4 = new JTextField();

        addBtn = new JButton("Add");

        // Set bounds (Matrix A)
        a1.setBounds(50,50,40,30); a2.setBounds(100,50,40,30);
        a3.setBounds(50,90,40,30); a4.setBounds(100,90,40,30);

        // Matrix B
        b1.setBounds(200,50,40,30); b2.setBounds(250,50,40,30);
        b3.setBounds(200,90,40,30); b4.setBounds(250,90,40,30);

        // Result
        r1.setBounds(350,50,40,30); r2.setBounds(400,50,40,30);
        r3.setBounds(350,90,40,30); r4.setBounds(400,90,40,30);

        addBtn.setBounds(200,150,80,30);

        add(a1); add(a2); add(a3); add(a4);
        add(b1); add(b2); add(b3); add(b4);
        add(r1); add(r2); add(r3); add(r4);
        add(addBtn);

        addBtn.addActionListener(this);

        setSize(500,300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int A[][] = new int[2][2];
        int B[][] = new int[2][2];
        int C[][] = new int[2][2];

        A[0][0] = Integer.parseInt(a1.getText());
        A[0][1] = Integer.parseInt(a2.getText());
        A[1][0] = Integer.parseInt(a3.getText());
        A[1][1] = Integer.parseInt(a4.getText());

        B[0][0] = Integer.parseInt(b1.getText());
        B[0][1] = Integer.parseInt(b2.getText());
        B[1][0] = Integer.parseInt(b3.getText());
        B[1][1] = Integer.parseInt(b4.getText());

        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        r1.setText(String.valueOf(C[0][0]));
        r2.setText(String.valueOf(C[0][1]));
        r3.setText(String.valueOf(C[1][0]));
        r4.setText(String.valueOf(C[1][1]));
    }

    public static void main(String[] args) {
        new MatrixAdd();
    }
}