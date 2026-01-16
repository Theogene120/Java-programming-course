public class test {
    public static void main (String args[]){
        try{
            System.out.print("Hello");
            int num = 1/0;
            System.out.print("Worldsss");
        }catch (ArithmeticException e){
            System.out.print(" java programmer");
        }finally{
            System.out.print("!!");
        }
    }
}