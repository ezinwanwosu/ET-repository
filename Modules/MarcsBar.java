
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;  
import java.lang.*;


public class MarcsBar extends JPanel implements MouseListener   {
    private int maximum;
    private int current;
    private static JProgressBar bar;
    private JPopupMenu hoverPopup;
    
    public MarcsBar(int c, int m){
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension (10,50));
        addMouseListener(this);



        maximum = m;
        current= c;
        bar = new JProgressBar();
        bar.setMaximum(maximum);
        bar.setValue(current);
        System.out.print(bar.getValue());
        bar.setStringPainted(true);
        bar.setForeground(new Color(200, 160, 255));
        bar.setBorder(new LineBorder(new Color(138,43,226),1));
        bar.setFont(new Font("Verdana",Font.BOLD,30));
        

        

        bar.setOrientation(SwingConstants.HORIZONTAL);
        this.add(bar,BorderLayout.CENTER);
      
    }
 
    public static void updateBar(){
        bar.setValue(DataHandler.returnCurrentTotal());
        bar.setMaximum(DataHandler.returnTotal());
    }


     
    public void mousePressed(MouseEvent e) {
        
     }
 
     public void mouseReleased(MouseEvent e) {
        
     }
 
     public void mouseEntered(MouseEvent e) {
        System.out.println("ENT");
     }
 
     public void mouseExited(MouseEvent e) {
        System.out.println("EXT");
     }
 
     public void mouseClicked(MouseEvent e) {
    
     }

}
