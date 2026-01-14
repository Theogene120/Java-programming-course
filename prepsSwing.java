import javax.swing.*;
import java.awt.*;

public class prepsSwing {
    public static void main(String[] args){
        JFrame frame = new JFrame("My first window");
        JButton button = new JButton("Click Me Bro");
        JTextField text = new JTextField(20);
        JLabel label =  new JLabel("Click on button");
        JLabel label2 = new JLabel();

        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(text);
        frame.add(button);
        frame.setSize(800, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Add event on button
        button.addActionListener(e -> {
            System.out.println("Button Clicked");
            label2.setText("Button clicked");
        });
        frame.add(label2);
    }
}

// import javax.swing.*;

// public class prepsSwing {
//     public static void main(String[] args){

//         JFrame frame = new JFrame("My first window");

//         // Create components
//         JLabel label = new JLabel("Click on button");
//         JTextField text = new JTextField(20);
//         JButton button = new JButton("Click Me Bro");
//         JLabel label1 = new JLabel();

//         // Create panel and set vertical layout
//         JPanel panel = new JPanel();
//         panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

//         // Add components to panel (top → bottom)
//         panel.add(label);
//         panel.add(text);
//         panel.add(button);

//         // Add panel to frame
//         frame.add(panel);

//         frame.setSize(800, 700);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setVisible(true);

//         // Button event
//         button.addActionListener(e -> {
//             System.out.println("Button Clicked");
//         });
//     }
// }

