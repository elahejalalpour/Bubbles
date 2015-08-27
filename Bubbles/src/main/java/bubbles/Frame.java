/*
 * In The Name Of God
 * ========================================
 * [] File Name : Frame.java
 *
 * [] Creation Date : 27-08-2015
 *
 * [] Created By : Elahe Jalalpour (el.jalalpour@gmail.com)
 * =======================================
*/
/**
 * @author Elahe Jalalpour
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bubbles;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import javax.swing.JFrame;

/**
 *
 * @elahe
 */
public class Frame extends JFrame implements MouseListener{
    Manager m;
    Point p;
       public Frame()
        {
            setVisible(false);
            setSize(650, 650);
            m=new Manager();
            setVisible(true);
            addMouseListener(this);
            
        }

    @Override
    public void mouseClicked(MouseEvent e) {
         if(e.getButton()==MouseEvent.BUTTON1)
         {
         p = e.getPoint();
         Bubbles b=new Bubbles();
         b.setX(p.x);
         b.setY(p.y);
         Manager.b.add(b);
         }
         if(e.getButton()==MouseEvent.BUTTON3)
         {
             p = e.getPoint();
             Iterator it=Manager.b.iterator();
             while(it.hasNext())
             {
                 Bubbles b=(Bubbles)it.next();
                         
                 if((b.getX()-100<p.x && b.getX()+100>p.x )&& (b.getY()-100<p.y && b.getY()+100>p.y))
                 {
                     it.remove();
                 }
             }
           /*  for(Bubbles bub:Manager.b)
             {
                 if((bub.getX()-100<p.x &&  bub.getX()+100>p.x )&& (bub.getY()-100<p.y && bub.getY()+100>p.y))
                 {
                     Manager.b.remove(bub);
                 }
             }*/
             
         }
    }
    public void running()
    {
        while(true){
            add(m);
            m.run();
            }
    }
    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
