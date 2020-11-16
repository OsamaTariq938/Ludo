
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author osama
 */
public class Goti extends JPanel {
    int x,y;
    public Goti()
    {
        this.x=200;
        this.y=200;
    }
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillOval(x, y, 20, 20);
    }
    
}
