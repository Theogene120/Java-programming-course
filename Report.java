import java.util.Scanner;

class Report {
    private int adno;  
    private String name;  
    private float[] marks = new float[5]; 
    private float average; 

    private void getAvg() {
        float sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += marks[i];
        }
        average = sum / 5;
    }

    public void readInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter admission number (4 digit): ");
        adno = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.println("Enter 5 marks:");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextFloat();
        }

        getAvg();

        sc.close();
    }

  
    public void displayInfo() {
        System.out.println("\nStudent Report");
        System.out.println("_________________________");
        System.out.println("Admission No : " + adno);
        System.out.println("Name         : " + name);

        System.out.print("Marks        : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(marks[i] + " ");
        }

        System.out.println("\nAverage      : " + average);
    }

    public static void main(String[] args) {
        Report obj = new Report();
        obj.readInfo();
        obj.displayInfo();
    }
}

