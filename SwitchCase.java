import java.util.*;

// public class SwitchCase {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String coffeType;
//         System.out.println("Enter the Passkey of your coffe");
//         int passCode = sc.nextInt();
//         switch (passCode) {
//             case 555: coffeType = "Espresso";
//                 break;
//             case 312: coffeType = "Vanilla latte";
//                 break;
//             case 629: coffeType = "Drip coffee";
//                 break;
//             default: coffeType = "Unknown";
//                 break;
//         }
//         System.out.println(coffeType);
//         sc.close();
//     }
// }



public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coffeType;
        System.out.println("Enter the Passkey of your coffe");
        int passCode = sc.nextInt();
        coffeType = switch (passCode) {
            case 555 -> {
                System.out.println("Strong and bold choice!");
                yield "Espresso";  // yield sends value back
            }
            case 312 -> {
                System.out.println("Sweet and creamy!");
                System.out.println("Extra sugar?");
                yield "Vanilla latte";
            }
            case 629 -> {
                System.out.println("Classic black coffee.");
                yield "Drip coffee";
            }
            default -> {
                System.out.println("Invalid code, try again.");
                yield "Unknown";
            }
        };

        System.out.println(coffeType);
        sc.close();
    }
}
