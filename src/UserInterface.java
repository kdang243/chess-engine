package src;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.MouseInputListener;

import java.awt.event.*;

public class UserInterface extends JPanel implements MouseInputListener {
    static int x = 0, y = 0;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.yellow);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);

        // Code below is example of how to create what we have, 
        // need to visualize the board after finish classes for possible moves
        g.setColor(Color.RED);
        g.fillRect(x - 20, y - 20, 40, 40);
        g.setColor(Color.BLUE);
        g.fillRect(10, 20, 100, 200);

        Image chessPiecesImage = new ImageIcon("CHessPieces.png").getImage();
        g.drawImage(chessPiecesImage, x, y, x+64, x+64, 0, 0, 64, 64,this);
    }

    // methods for interface mouseinputlistener
    // TODO: when you visualize, finish this for the user interface
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
