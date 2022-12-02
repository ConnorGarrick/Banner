//Create a graphic representation of a moving banner

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Banner extends JPanel implements ActionListener
{
  //iinstance fields
  int xPos, yPos; //position
  
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    g.setColor(Color.RED);
    g.drawString ("Hello, Java Rules", xPos, yPos);
  }

//called when the timer object "fires"
public void actionPerformed(ActionEvent e)
{
  xPos--;
  if(xPos < -100)
    xPos = getWidth();
  
  repaint();
  }



public static void main(String[] args)
{
  JFrame window = new JFrame("Action Demo");
  window.setBounds(300, 300, 300, 100);
  
  Banner panel = new Banner();
  panel.setBackground(Color.CYAN);
  
  Container c = window.getContentPane();
  c.add(panel);
  
  window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  window.setVisible(true);
  
  panel.xPos = panel.getWidth();
  panel.yPos = panel.getHeight();
  
  Timer clock = new Timer(30, panel);
  clock.start();
}
}

  
  
  
  
  
  
  
  
  
  
  
  
  