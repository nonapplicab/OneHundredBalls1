import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(750,750);
        frame.getWidth();

        MyPanel panel = new MyPanel();
        frame.add(panel);
        frame.setVisible(true);
    }
}