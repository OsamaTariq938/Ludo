
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.layout.Border;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author osama
 */
public class MainGUI {
    JFrame fr; //main frame
    JPanel [] mainPanels;// main panels 
    JPanel [] center;//panels for center
    JPanel [] innerPanels;//inner panels
    JTextField tf1,tf2;
    JButton b1,b2;
    JPanel jj,jj1;
    MovementControler hnd;
    JFrame win1,win2;
     JLabel lb1,lb2;
    Goti g,g1;
    int [] rp;
    int [] yp;
    

    public MainGUI() {
    initGUI();
    }
    public void initGUI()
    {
        jj= new JPanel();
        jj1 = new JPanel();
        fr = new JFrame("LUDO");
        mainPanels=new JPanel[9];
        center = new JPanel[4];
        innerPanels= new JPanel[72];
        
       g= new Goti();
       g1=new Goti();
       
        
        tf1= new JTextField(15);
        tf2= new JTextField(15);
        tf1.setEditable(false);
        tf2.setEditable(false); 
        b1=new JButton("Player1");
        b2=new JButton("Player2");
        hnd = new MovementControler(this);
        b1.addActionListener(hnd);
        b2.addActionListener(hnd);
        b1.setBackground(Color.LIGHT_GRAY);
        b2.setBackground(Color.LIGHT_GRAY);
        
        //winning GUI pop ups
        win1 = new JFrame("Winner !!");
        win2 = new JFrame("Winner !!");
        win1.setLocation(500, 280);
        win1.setSize(200,200);
        lb1= new JLabel("Player 1 has won the Match!!");
         win2.setLocation(500, 280);
        win2.setSize(200,200);
        lb2= new JLabel();
        lb2= new JLabel("Player 2 has won the Match!!");
        win1.setBackground(Color.yellow);
        win1.add(lb1);
        win1.setLayout(new FlowLayout());
        win1.setVisible(false);
        win2.add(lb2);
        win1.setLayout(new FlowLayout());
        win1.setVisible(false);
        
        
        
        //initiailization of main panels
        for(int i=0;i<9;i++)
        {
            mainPanels[i]= new JPanel();
        }
       // mainPanels[0].add(g);//goti add ki hai
        for (int i=0;i<4;i++)
        {
            center[i]=new JPanel();
        }
        for (int i=0;i<=71;i++)
        {
            innerPanels[i]=new JPanel();
        }
        innerPanels[1].add(g);
        innerPanels[27].add(g1);
        g.setBackground(Color.MAGENTA);
        g1.setBackground(Color.cyan);
        
        jj.setBackground(Color.red);
        jj1.setBackground(Color.yellow);
        
        
        
        

        //initialiizing the paths for red and yellow side
        rp= new int[56];
        yp=new int[56];
        for(int i=0;i<56;i++)
        {
            rp[i]=(i+1);
        }
        int s=27;//string point of yellow
        for(int i=0;i<25;i++)
        {
           yp[i]=s;
           s++;
        }
        s=0;
       for(int i=25;i<50;i++)
       {
           yp[i]=s;
           s++;
       }
       s=66;
       for(int i=51;i<=55;i++)
       {
           yp[i]=s;
           s--;
       }
        
        
        fr.setSize(700,700);
        //setting backgrounf of main 9 panels
        mainPanels[0].setBackground(Color.green);
        mainPanels[1].setBackground(Color.white);
        mainPanels[2].setBackground(Color.red);
        mainPanels[3].setBackground(Color.white);
        mainPanels[4].setBackground(Color.white);
        mainPanels[5].setBackground(Color.white);
        mainPanels[6].setBackground(Color.yellow);
        mainPanels[7].setBackground(Color.white);
        mainPanels[8].setBackground(Color.blue);
        fr.setLocation(250, 20);
        //setting background of all inner panels
        
        for(int i=41;i<=51;i++)
        {
           innerPanels[i].setBackground(Color.LIGHT_GRAY); 
        }
        for(int i=2;i<=13;i++)
        {
           innerPanels[i].setBackground(Color.LIGHT_GRAY); 
        }
        for(int i=15;i<=26;i++)
        {
           innerPanels[i].setBackground(Color.LIGHT_GRAY); 
        }
        for(int i=28;i<=39;i++)
        {
           innerPanels[i].setBackground(Color.LIGHT_GRAY); 
        }
        for(int i=52;i<=56;i++)
        {
           innerPanels[i].setBackground(Color.RED); 
        }
        for(int i=57;i<=61;i++)
        {
           innerPanels[i].setBackground(Color.blue); 
        }
        for(int i=62;i<=66;i++)
        {
           innerPanels[i].setBackground(Color.yellow); 
        }
        for(int i=67;i<=71;i++)
        {
           innerPanels[i].setBackground(Color.green); 
        }
        innerPanels[0].setBackground(Color.LIGHT_GRAY);
        innerPanels[1].setBackground(Color.red);
        innerPanels[14].setBackground(Color.blue);
        innerPanels[27].setBackground(Color.yellow);
        innerPanels[40].setBackground(Color.green);
        //done with background
        
        //now adding these panels into mainpanels
        //adding on red side
        mainPanels[1].add(innerPanels[50]);
        mainPanels[1].add(innerPanels[51]);
        mainPanels[1].add(innerPanels[0]);
        mainPanels[1].add(innerPanels[49]);
        mainPanels[1].add(innerPanels[52]);
        mainPanels[1].add(innerPanels[1]);
        mainPanels[1].add(innerPanels[48]);
        mainPanels[1].add(innerPanels[53]);
        mainPanels[1].add(innerPanels[2]);
        mainPanels[1].add(innerPanels[47]);
        mainPanels[1].add(innerPanels[54]);
        mainPanels[1].add(innerPanels[3]);
        mainPanels[1].add(innerPanels[46]);
        mainPanels[1].add(innerPanels[55]);
        mainPanels[1].add(innerPanels[4]);
        mainPanels[1].add(innerPanels[45]);
        mainPanels[1].add(innerPanels[56]);
        mainPanels[1].add(innerPanels[5]);
        mainPanels[1].setLayout(new GridLayout(6, 3, 2, 2));
        //adding on blue side
        mainPanels[5].add(innerPanels[6]);
        mainPanels[5].add(innerPanels[7]);
        mainPanels[5].add(innerPanels[8]);
        mainPanels[5].add(innerPanels[9]);
        mainPanels[5].add(innerPanels[10]);
        mainPanels[5].add(innerPanels[11]);
        mainPanels[5].add(innerPanels[57]);
        mainPanels[5].add(innerPanels[58]);
        mainPanels[5].add(innerPanels[59]);
        mainPanels[5].add(innerPanels[60]);
        mainPanels[5].add(innerPanels[61]);
        mainPanels[5].add(innerPanels[12]);
        mainPanels[5].add(innerPanels[18]);
        mainPanels[5].add(innerPanels[17]);
        mainPanels[5].add(innerPanels[16]);
        mainPanels[5].add(innerPanels[15]);
        mainPanels[5].add(innerPanels[14]);
        mainPanels[5].add(innerPanels[13]);
        mainPanels[5].setLayout(new GridLayout(3, 6, 2, 2));
        //adding on yellow side
         mainPanels[7].add(innerPanels[31]);
        mainPanels[7].add(innerPanels[62]);
        mainPanels[7].add(innerPanels[19]);
        mainPanels[7].add(innerPanels[30]);
        mainPanels[7].add(innerPanels[63]);
        mainPanels[7].add(innerPanels[20]);
        mainPanels[7].add(innerPanels[29]);
        mainPanels[7].add(innerPanels[64]);
        mainPanels[7].add(innerPanels[21]);
        mainPanels[7].add(innerPanels[28]);
        mainPanels[7].add(innerPanels[65]);
        mainPanels[7].add(innerPanels[22]);
        mainPanels[7].add(innerPanels[27]);
        mainPanels[7].add(innerPanels[66]);
        mainPanels[7].add(innerPanels[23]);
        mainPanels[7].add(innerPanels[26]);
        mainPanels[7].add(innerPanels[25]);
        mainPanels[7].add(innerPanels[24]);
        mainPanels[7].setLayout(new GridLayout(6, 3, 2, 2));
        //adding on green side
         mainPanels[3].add(innerPanels[39]);
        mainPanels[3].add(innerPanels[40]);
        mainPanels[3].add(innerPanels[41]);
        mainPanels[3].add(innerPanels[42]);
        mainPanels[3].add(innerPanels[43]);
        mainPanels[3].add(innerPanels[44]);
        mainPanels[3].add(innerPanels[38]);
        mainPanels[3].add(innerPanels[67]);
        mainPanels[3].add(innerPanels[68]);
        mainPanels[3].add(innerPanels[69]);
        mainPanels[3].add(innerPanels[70]);
        mainPanels[3].add(innerPanels[71]);
        mainPanels[3].add(innerPanels[37]);
        mainPanels[3].add(innerPanels[36]);
        mainPanels[3].add(innerPanels[35]);
        mainPanels[3].add(innerPanels[34]);
        mainPanels[3].add(innerPanels[33]);
        mainPanels[3].add(innerPanels[32]);
        mainPanels[3].setLayout(new GridLayout(3, 6, 2, 2));
        
        //setting background of center pnels
        center[0].setBackground(Color.red);
        center[1].setBackground(Color.green);
        center[2].setBackground(Color.yellow);
        center[3].setBackground(Color.blue);
        mainPanels[4].setLayout(new BorderLayout());
        mainPanels[4].add(center[0],BorderLayout.NORTH);
        mainPanels[4].add(center[1],BorderLayout.WEST);
        mainPanels[4].add(center[2],BorderLayout.SOUTH);
        mainPanels[4].add(center[3],BorderLayout.EAST);
        
        
        
        //addinng text feilds in panels for players
        mainPanels[2].add(tf1);
        mainPanels[6].add(tf2);
        mainPanels[2].add(b1);
        mainPanels[6].add(b2);
        mainPanels[2].setLayout( new FlowLayout());
        mainPanels[6].setLayout( new FlowLayout());
        
        mainPanels[2].add(jj);
        mainPanels[6].add(jj1);
        
        
        
        
        
        //adding panels to frame
        for(int i=0;i<9;i++)
        {
            fr.add(mainPanels[i]);
        }
       fr.setLayout(new GridLayout(3,3,2,2));
        //fr.setLayout(new GridLayout(5,1,2,2));
       
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
   
        
    
    
    
}
