package Lib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class RollingBall extends JPanel implements ActionListener{
    int x = 100;
    int y = 90;
    int start = 0;
    public RollingBall(){
        Timer timer1 = new Timer(25, this);
        timer1.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(x, y, 80, 80);
        g.fillArc(x, y, 80, 80, start, 180);
    
    }
    public void actionPerformed(ActionEvent e) {
        start += 5;
        if (x != -30) {
            x -= 5;
        }else{
            x = 330;
        }
        paintComponent(this.getGraphics());
    }   
}



