public class Sum {
    public static int sum(int[] a){
        int tatol = 0;
        for(int i = 0; i < a.length; i++){
            tatol += a[i];
        }
        return tatol;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int result = sum(arr);
        System.out.print(result);
    }
    
}
