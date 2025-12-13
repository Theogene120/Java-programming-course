import java.util.*;

public class Methode {

    public int[] multi(int[] a, int n){
        for(int i = 0; i < a.length; i++){
            a[i] = a[i] * n;
        }
        return a;
    }

    public static void main(String[] args){

        Methode obj = new Methode();

        int b[] = {1,2,3,4,5};
        int c[] = obj.multi(b, 3);
        System.out.println(Arrays.toString(c));
    }
}
