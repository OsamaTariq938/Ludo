
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.StyleConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author osama
 */
public class MovementControler implements ActionListener{

    MainGUI refg;
    int p1=1,p2=27;
    int p11,p22=0;
    boolean pressed=false;
    static JLabel l; 
    ImageIcon i;
   
   public MovementControler(MainGUI g)
   {
       refg=g;
       l=new JLabel();
   }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase("Player1"))
        {
            
            if(pressed==false)
            {
            int x = (int)(Math.random()*((6-1)+1))+1;
            p1=p1+x;
            if(p1>56)
            {
                refg.win1.setVisible(true);
                refg.fr.setVisible(false);
                refg.fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            String s=String.valueOf(x);
            if(x==1)
            {
                i=new ImageIcon("1.png");
                l.setSize(50, 50);
                Image img = i.getImage();
                Image newImg=img.getScaledInstance(l.getWidth(), l.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(newImg);
                l.setIcon(image); 
            }
            if(x==2)
            {
                i=new ImageIcon("2.png");
                l.setSize(50, 50);
                Image img = i.getImage();
                Image newImg=img.getScaledInstance(l.getWidth(), l.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(newImg);
                l.setIcon(image); 
            }
            if(x==3)
            {
                i=new ImageIcon("3.png");
                l.setSize(50, 50);
                Image img = i.getImage();
                Image newImg=img.getScaledInstance(l.getWidth(), l.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(newImg);
                l.setIcon(image); 
            }
            if(x==4)
            {
                i=new ImageIcon("4.png");
                l.setSize(50, 50);
                Image img = i.getImage();
                Image newImg=img.getScaledInstance(l.getWidth(), l.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(newImg);
                l.setIcon(image); 
               // refg.win1.setVisible(true);
            }
            if(x==5)
            {
                i=new ImageIcon("5.png");
                l.setSize(50, 50);
                Image img = i.getImage();
                Image newImg=img.getScaledInstance(l.getWidth(), l.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(newImg);
                l.setIcon(image); 
            }
            if(x==6)
            {
                i=new ImageIcon("6.png");
                l.setSize(50, 50);
                Image img = i.getImage();
                Image newImg=img.getScaledInstance(l.getWidth(), l.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(newImg);
                l.setIcon(image); 
            }
            
            
            refg.mainPanels[2].add(l);
            refg.jj.add(l);
            refg.tf1.setText(s);
            
           // refg.mainPanels[8].add(refg.center[0]);
           refg.g.setVisible(false);
            
           refg.innerPanels[p1].add(refg.g);
           refg.g.setVisible(true);
           
           if(p1==p2)
           {
               refg.g1.setVisible(false);
               refg.innerPanels[27].add(refg.g1);
               refg.g1.setVisible(true);
               p2=27;
           }
          
          if(x!=6)
          {
            pressed=true;
          }
         
            }  
            
        }
        if(e.getActionCommand().equalsIgnoreCase("Player2"))
        {
            if(pressed==true)
            {
            int x = (int)(Math.random()*((6-1)+1))+1;
            p11=p11+x;
            if(p11>=56)
            {
                refg.win2.setVisible(true);
                refg.fr.setVisible(false);
                refg.fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            p2=refg.yp[p11]; // p2=p2+x;
            String s=String.valueOf(x);  
            refg.tf2.setText(s);
                     if(x==1)
            {
                i=new ImageIcon("1.png");
                l.setSize(50, 50);
                Image img = i.getImage();
                Image newImg=img.getScaledInstance(l.getWidth(), l.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(newImg);
                l.setIcon(image); 
            }
            if(x==2)
            {
                i=new ImageIcon("2.png");
                l.setSize(50, 50);
                Image img = i.getImage();
                Image newImg=img.getScaledInstance(l.getWidth(), l.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(newImg);
                l.setIcon(image); 
            }
            if(x==3)
            {
                i=new ImageIcon("3.png");
                l.setSize(50, 50);
                Image img = i.getImage();
                Image newImg=img.getScaledInstance(l.getWidth(), l.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(newImg);
                l.setIcon(image); 
            }
            if(x==4)
            {
                i=new ImageIcon("4.png");
                l.setSize(50, 50);
                Image img = i.getImage();
                Image newImg=img.getScaledInstance(l.getWidth(), l.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(newImg);
                l.setIcon(image); 
            }
            if(x==5)
            {
                i=new ImageIcon("5.png");
                l.setSize(50, 50);
                Image img = i.getImage();
                Image newImg=img.getScaledInstance(l.getWidth(), l.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(newImg);
                l.setIcon(image); 
            }
            if(x==6)
            {
                i=new ImageIcon("6.png");
                l.setSize(50, 50);
                Image img = i.getImage();
                Image newImg=img.getScaledInstance(l.getWidth(), l.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(newImg);
                l.setIcon(image); 
            }
            
            
            refg.mainPanels[6].add(l);
            refg.jj1.add(l);;
             refg.g1.setVisible(false);
            
           refg.innerPanels[p2].add(refg.g1);
           refg.g1.setVisible(true);
           if(p2==p1)
           {
               refg.g.setVisible(false);
               refg.innerPanels[1].add(refg.g);
               refg.g.setVisible(true);
               p1=1;
           }
            if(x!=6)
            {
            pressed=false;
            }
            }
        }
    }
    /*refg.mainPanels[0].add(refg.g);
        try {
                    Thread.sleep(150);
                } catch (InterruptedException ex) {
                }
        refg.mainPanels[8].add(refg.g);*/
    
}
