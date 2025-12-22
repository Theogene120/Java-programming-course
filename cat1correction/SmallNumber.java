package cat1correction;

public class SmallNumber {
    public static int smallElement(int x[],  int n){

        int minIdx = 0;
        for(int i = 0; i < n; i++){
            if(x[i] < x[minIdx]){
                minIdx = i;
            }
        }

        return minIdx;
    }

    public static void main(String[] args){

        int[] arr = {3,5,1,2,7,8};
        int len = arr.length;
        int result = SmallNumber.smallElement(arr, len);
        System.out.println(result);
    }
}
