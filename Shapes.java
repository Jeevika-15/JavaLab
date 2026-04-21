//15. Create one jframe apply 10 buttons on that after clicking on each button a new structure is created.(Circle, Oval, Rectangle, etc...)

import javax.swing.*;

class Shapes {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        for(int i=1;i<=10;i++){
            JButton b = new JButton("B"+i);
            b.setBounds(50*i,50,60,30);
            f.add(b);
        }

        f.setSize(600,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}