import java.util.*;;

public class AnyInCommon {


    public static boolean hasCommon(int[] a, int[] b){

        HashSet <Integer> set = new HashSet<>();

        for(int num: a){
            set.add(num);
        }

        for(int n: b){
            if(set.contains(n)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] orgs){

         int[] arr1 = {7,2,3,4};
        int[] arr2 = {5,6,7,8};

        boolean res = hasCommon(arr1, arr2);

        System.out.println(res);
        }

}