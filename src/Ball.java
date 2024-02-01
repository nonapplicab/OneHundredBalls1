import java.awt.*;
import javax.swing.*;
public class Ball {
    private int size = (int) (Math.random()*10) + 10;
    private Color coolor = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));;
    private int velocity = (int) ((Math.random()-.5)*100);
    private int   drop = (int)((Math.random()-.5)*100);;
    private int xLocation;
    private int yLocation;


    public Ball (JPanel w){
        xLocation = (int)(Math.random()* w.getWidth());
        yLocation = (int)(Math.random()* w.getWidth());
    }
  
    public void move(int w, int h){
        xLocation+=velocity;
        yLocation+=drop;
        if (yLocation + drop + size > h ||yLocation + drop < 0 ){
            drop = -1 * (drop+ (int)((Math.random()*10)-5)
);
        }
        if (xLocation + velocity + size > w || xLocation+velocity < 0 ){
            velocity = -1 * (velocity + (int)((Math.random()*10)-5)
);
        }

    }
    public void draw(Graphics g6){
        g6.setColor(coolor);
        g6.fillOval(xLocation,yLocation,size,size);
    }

}
