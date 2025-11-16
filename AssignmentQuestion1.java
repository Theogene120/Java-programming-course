import javax.swing.JOptionPane;

public class AssignmentQuestion1 {
    public static void main(String[] orgs){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number:"));

        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number:"));

        int sum = num1 + num2;

        System.out.println("Sum Of Entered Numbers Is: " + sum);
    }
}
