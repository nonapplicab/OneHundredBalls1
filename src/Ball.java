import java.awt.*;
import javax.swing.*;
public class Ball {
    private int size;
    private Color coolor;
    private int velocity;
    private int xLocation;
    private int yLocation;
    public Ball (int x,int y){
        xLocation = x;
        yLocation = y;
        size = (int) (Math.random()*100) + 10;
        coolor = new Color((int)Math.random()*255,(int)Math.random()*255,(int)Math.random()*255);
        velocity = (int) (Math.random()*1000);
    }
    public Ball (JPanel w){
        xLocation = (int)(Math.random()* w.getWidth());
        yLocation = (int)(Math.random()* w.getWidth());
        size = (int) (Math.random()*100) + 10;
        coolor = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        velocity = (int) (Math.random()*1000);
    }
    public void move(int w, int h){
        xLocation+=velocity;
        if (yLocation+velocity> h ||yLocation+velocity<0 ){
            velocity= -1*velocity;
        }
        if (xLocation+velocity> h ||yLocation+velocity<0 ){
            velocity= -1*velocity;
        }

    }
    public void draw(Graphics g6){
        g6.setColor(coolor);
        g6.fillOval(xLocation,yLocation,size,size);
    }

}
