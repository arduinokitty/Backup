// Java Program to create a
// canvas and mouse listener to the
// canvas ( a circle of radius 5 will appear
// at the points where mouse are clicked or
// dragged on the canvas)
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class canvas extends JFrame implements MouseListener, MouseMotionListener {
  static double Color_Val = 0;

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
          if ((e.getModifiers() & InputEvent.BUTTON1_MASK) != 0) {
            Graphics g = c.getGraphics();
if(Color_Val == 1){
   g.setColor(Color.black);
}


        // get X and y position
        int x, y;
        x = e.getX();
        y = e.getY();

        // draw a Oval at the point
        // where mouse is moved
        g.fillOval(x, y, 5, 5);
    }

    if ((e.getModifiers() & InputEvent.BUTTON3_MASK) != 0) {
            Graphics g = c.getGraphics();

        g.setColor(Color.white);

        // get X and y position
        int x, y;
        x = e.getX();
        y = e.getY();

        // draw a Oval at the point
        // where mouse is moved
        g.fillOval(x, y, 50, 50);
    }

    }

    public void mouseMoved(MouseEvent e)
    {
    }

    public void mouseDragged(MouseEvent e)
    {
         if ((e.getModifiers() & InputEvent.BUTTON1_MASK) != 0) {
            Graphics g = c.getGraphics();
if(Color_Val == 0){
g.setColor(Color.black);

}
if(Color_Val == 1){
    g.setColor(Color.red);

}
if(Color_Val == 2){
    g.setColor(Color.blue);

}
if(Color_Val == 3){
    g.setColor(Color.orange);

}
if(Color_Val == 4){
    g.setColor(Color.green);

}
if(Color_Val == 5){
    g.setColor(Color.magenta);
    
}
if(Color_Val == 6){
    g.setColor(Color.cyan);
     
}
if(Color_Val == 7){
    g.setColor(Color.yellow);

}

        // get X and y position
        int x, y;
        x = e.getX();
        y = e.getY();

        // draw a Oval at the point
        // where mouse is moved
        g.fillOval(x, y, 5, 5);
    }
      if ((e.getModifiers() & InputEvent.BUTTON3_MASK) != 0) {
            Graphics g = c.getGraphics();

        g.setColor(Color.white);

        // get X and y position
        int x, y;
        x = e.getX();
        y = e.getY();

        // draw a Oval at the point
        // where mouse is moved
        g.fillOval(x, y, 50, 50);
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
            JFrame f=new JFrame("Color pallete");
             JLabel label = new JLabel ("Black");
             label.setVisible(true);
             f.add(label);

    JButton b=new JButton("Change Color");  
    b.setBounds(50,100,95,30);  
    b.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){ 
       Color_Val = Color_Val + 1;
            if(Color_Val == 8){
                Color_Val = 0;
            }
            if(Color_Val == 0){
label.setText("Black");
System.out.println("Black");
}
if(Color_Val == 1){

    f.setBackground(Color.red);
    label.setText("Red");
    System.out.println("Red");
}
if(Color_Val == 2){
 
        f.setBackground(Color.blue);
        label.setText("Blue");
        System.out.println("Blue");
}
if(Color_Val == 3){

        f.setBackground(Color.orange);
        label.setText("Orange");
        System.out.println("Orange");
}
if(Color_Val == 4){
          f.setBackground(Color.green);
          label.setText("Green");
          System.out.println("Green");
}
if(Color_Val == 5){

        f.setBackground(Color.magenta);
        label.setText("Magenta");
        System.out.println("Magenta");
}
if(Color_Val == 6){
 
        f.setBackground(Color.cyan);
        label.setText("Cyan");
        System.out.println("Cyan");
}
if(Color_Val == 7){
        f.setBackground(Color.yellow);
        label.setText("Yellow");
        System.out.println("Yellow");
}


        }  
    });  
f.add(b);

    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 
    }
}
