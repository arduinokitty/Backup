// Java Program to create a
// canvas and mouse listener to the
// canvas ( a circle of radius 5 will appear
// at the points where mouse are clicked or
// dragged on the canvas)
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class canvas extends JFrame implements MouseListener, MouseMotionListener {
int x;
int 7;
    // create a canvas
    Canvas c;

    // constructor
    canvas()
    {
        super("canvas");

        // create a empty canvas
        c = new Canvas() {
            public void paint(Graphics g)
            {
            }
        };

        // set background
        c.setBackground(Color.white);

        // add mouse listener
        c.addMouseListener(this);
        c.addMouseMotionListener(this);

        add(c);
        setSize(400, 300);
        show();
    }

    // mouse listener and mouse motion listener methods
    public void mouseClicked(MouseEvent e)
    {
}


        // get X and y position
        int x, y;
        x = e.getX();
        y = e.getY();

        // draw a Oval at the point
        // where mouse is moved
    }

    if ((e.getModifiers() & InputEvent.BUTTON3_MASK) != 0) {

        // get X and y position
        int x, y;
        x = e.getX();
        y = e.getY();

        // draw a Oval at the point
        // where mouse is moved
    }


    public void mouseMoved(MouseEvent e)
    {
    }

    public void mouseDragged(MouseEvent e)
    {
         if ((e.getModifiers() & InputEvent.BUTTON1_MASK) != 0) {
                    int x, y;
        x = e.getX();
        y = e.getY();
    }
      if ((e.getModifiers() & InputEvent.BUTTON3_MASK) != 0) {

        // get X and y position
        int x, y;
        x = e.getX();
        y = e.getY();

        // draw a Oval at the point
        // where mouse is moved
    }
    }

    public void mouseExited(MouseEvent e)
    {
    }

    public void mouseEntered(MouseEvent e)
    {
    }

    public void mouseReleased(MouseEvent e)
    {
    }

    public void mousePressed(MouseEvent e)
    {
    } 

    



    public static void main(String args[])
    {


        canvas c = new canvas();
    }
    
