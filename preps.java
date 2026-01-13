public class preps {
    public static int div(int a, int b){
        return a/b;
    }
    public static void main(String[] args){
        try{
            System.out.println(div(10,0));
        }catch(Exception e){
            System.out.println("Invalid denominator");
        }
    }
}
