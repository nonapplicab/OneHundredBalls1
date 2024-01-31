import java.awt.*;
import javax.swing.*;
public class Ball {
    private int size;
    private Color coolor;
    private int velocity;
    private int drop;
    private int xLocation;
    private int yLocation;


    public Ball (JPanel w){
        xLocation = (int)(Math.random()* w.getWidth());
        yLocation = (int)(Math.random()* w.getWidth());
        size = (int) (Math.random()*100) + 10;
        coolor = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        velocity = (int) ((Math.random()-.5)*100);
        drop = (int) ((Math.random()-.5)*100);
    }
    public void move(int w, int h){
        xLocation+=velocity;
        yLocation+=drop;
        if (yLocation + drop+ size > h ||yLocation + drop < 0 ){
            drop= -1 * drop;
        }
        if (xLocation + velocity + size > w || xLocation+velocity < 0 ){
            velocity= -1 * velocity;
        }

    }
    public void draw(Graphics g6){
        g6.setColor(coolor);
        g6.fillOval(xLocation,yLocation,size,size);
    }

}
