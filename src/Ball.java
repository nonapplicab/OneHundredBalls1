import java.awt.*;
import javax.swing.*;
import java.awt.Color;
public class Ball {
  private int size = (int)(Math.random() * 90) + 10;
  private Color coolor = new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256));
  private int velocity = (int)((Math.random() - .5) * 100);
  private int drop = (int)((Math.random() - .5) * 100);;
  private int xLocation;
  private int yLocation;

  public Ball(JPanel w) {
    xLocation = (int)((Math.random() * w.getWidth()));
    yLocation = (int)((Math.random() * w.getHeight()));
    doctor(w);
  }
  public Ball(JPanel w, int i) {
    xLocation = i;
    yLocation = i;
    coolor = new Color(0, 0, 0);
    velocity = 0;
    drop = 0;
    size = 100;
  }
  public void move(int w, int h, JPanel j) {
    doctor(j);
    if ((yLocation + drop < 0) || (yLocation + drop + size > h)) {
      drop = drop * -1;
      velocity = velocity + (int)((Math.random() - .5) * 10);
    }else{
      yLocation += drop;
    }
    if ((xLocation + velocity < 0) || (xLocation + velocity + size > w)) {
      drop = drop + (int)(((Math.random() - .5) * 10));
      velocity = velocity * -1;
    }else{
      xLocation += velocity;
    }
  }
  public void draw(Graphics g6) {
    g6.setColor(coolor);
    g6.fillOval(xLocation, yLocation, size, size);
  }

  private void doctor(JPanel w){
    if (xLocation + size > w.getWidth()) {
      xLocation = xLocation - size;
    }
    if (yLocation + size > w.getHeight()) {
      yLocation = yLocation - size;
    }
  }
}