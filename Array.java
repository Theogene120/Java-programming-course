import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int arr[] = {3,5,1,4,2};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);

        System.out.println("Coded by Theos");

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr)); 
    }
}
