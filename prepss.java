// class MyException extends Exception {
//     public MyException(String message){
//         super(message);
//     }
// }

// public class prepss {
//     public static void main(String[] args){
//         try{
//             Exception theos = new MyException("I created you to thrown here");
//         }catch(MyException e){
//             System.out.println("catch:" + e.getMessage());
//         }
//     }
// }

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class prepss {
    public static void main(String[] args) {
        try {
            throw new MyException("I created you to throw here"); // throw it!
        } catch (MyException e) {
            System.out.println("catch: " + e.getMessage());
        }
    }
}

