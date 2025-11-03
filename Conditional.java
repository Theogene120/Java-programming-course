
import java.util.*;
public class Conditional {
    public static void main(String[] args){
        Scanner th = new Scanner(System.in);
        System.out.println("Please enter the balance");
        int balance = th.nextInt();
        String answer;

        answer = (balance == 0) ? "We broken even": (balance > 0) ? "We make a profit" : "We're in the red!";
        System.out.println(answer);

        th.close();
    }
}
