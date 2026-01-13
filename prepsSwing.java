import javax.swing.*;
public class prepsSwing {
    public static void main(String[] args){
        JFrame frame = new JFrame("My first window");
        JButton button = new JButton("Click Me Bro");
        JTextField text = new JTextField("Enter your name here");

        frame.add(text);
        frame.add(button);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
