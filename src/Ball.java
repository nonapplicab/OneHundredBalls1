import java.awt.*;
import javax.swing.*;
public class Ball {
    private int size = (int) (Math.random()*100) + 10;
    private Color coolor = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));;
    private int velocity = (int) ((Math.random()-.5)*100);
    private int   drop = (int)((Math.random()-.5)*100);;
    private int xLocation;
    private int yLocation;


    public Ball (JPanel w){
        xLocation = (int)((Math.random()* w.getWidth())-size);
        yLocation = (int)((Math.random()* w.getWidth())-size);
    }
  
    public void move(int w, int h){
        xLocation+=velocity;
        yLocation+=drop;
        if ((yLocation+drop+size<0)||(yLocation+drop>h)){
            drop = drop * -1 ;
            velocity = velocity + (int)((Math.random()-.5)*10);
        }
        if ((xLocation+velocity<0)||(xLocation+velocity+size>w)){
            drop = drop + (int)(((Math.random()-.5)*10));
            velocity = velocity * -1;
        }
    }
    public void draw(Graphics g6){
        g6.setColor(coolor);
        g6.fillOval(xLocation,yLocation,size,size);
    }

}
