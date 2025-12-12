class MathUtils {
    static int add(int a, int b) {
        return a + b;
    }

    static void printMessage() {
        System.out.println("Hello!");
    }
}


public class StaticClass {
    public static void main(String[] args){
        int plus = MathUtils.add(2, 5);
        System.out.println(plus);
        MathUtils.printMessage();
    }
}
