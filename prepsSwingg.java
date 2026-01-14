import javax.swing.*;
import java.awt.*;

public class prepsSwingg {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Checkbox and Choice Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create checkbox
        JCheckBox checkBox = new JCheckBox("I agree");

        // Create choice (dropdown)
        Choice choice = new Choice();
        choice.add("Java");
        choice.add("Python");
        choice.add("JavaScript");

        // Create button
        JButton button = new JButton("Submit");

        // Add components
        frame.add(checkBox);
        frame.add(choice);
        frame.add(button);

        // Button action
        button.addActionListener(e -> {
            System.out.println("Checkbox selected: " + checkBox.isSelected());
            System.out.println("Selected language: " + choice.getSelectedItem());
        });

        // Show frame
        frame.setVisible(true);
    }
}

