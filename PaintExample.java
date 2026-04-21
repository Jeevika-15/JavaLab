//16. Just using mouse event create a frame like paint brush with selection of colour and width.

import javax.swing.*;
import java.awt.event.*;

class PaintExample extends JFrame implements MouseMotionListener {
    PaintExample() {
        addMouseMotionListener(this);
        setSize(400,400);
        setVisible(true);
    }

    public void mouseDragged(MouseEvent e) {
        getGraphics().fillOval(e.getX(), e.getY(), 5, 5);
    }

    public void mouseMoved(MouseEvent e) {}

    public static void main(String[] args) {
        new PaintExample();
    }
}