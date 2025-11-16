import java.util.Scanner;

public class AssignmentQuestion12 {

    public static void main(String[] args){
        Scanner th = new Scanner(System.in);

        System.out.print("Please Enter Fist number:");
        int num1 = th.nextInt();

        System.out.print("Please Enter Second Number:");
        int num2 = th.nextInt();

        int sum = num1 + num2;

        System.out.print("Sum Of Entered Number Is: " + sum);

        th.close();
    }
}