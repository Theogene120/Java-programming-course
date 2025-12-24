package cat1correction;
import java.util.Scanner;

public class Sum {
    public static void main(String [] args){
        Scanner th = new Scanner(System.in);
        int num1, num2;
        int sum;

        System.out.print("Enter first number:");
        num1 = th.nextInt();
        System.out.print("Enter second number:");
        num2 = th.nextInt(); 

        sum = num1 + num2;

        System.out.println("Sum of Entered number is: " + sum);

        th.close();
    }
}
