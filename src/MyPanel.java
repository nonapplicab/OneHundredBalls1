import javax.swing.*;
import java.awt.*;
public class MyPanel extends JPanel {
    Ball ballers []= new Ball[1];

    public MyPanel(){
        setSize(250,250);
        for(int i = 0; i< ballers.length;i++){
            ballers [i] = new Ball(this);
        }
    //  ballers[0]= new Ball(this, 0);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
      
        for(int i = 0; i< ballers.length;i++) {
            ballers[i].draw(g);
            ballers[i].move(getWidth(), getHeight(),this);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("do the thing");
            }
        }
           repaint();
    }
}
