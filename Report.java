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
        Scanner th = new Scanner(System.in);

        System.out.print("Enter admission number (4 digit): ");
        adno = th.nextInt();
        th.nextLine(); // clear buffer

        System.out.print("Enter name: ");
        name = th.nextLine();

        System.out.println("Enter 5 marks:");
        for (int i = 0; i < 5; i++) {
            marks[i] = th.nextFloat();
        }

        getAvg();

        th.close();
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
        Report cyn = new Report();
        cyn.readInfo();
        cyn.displayInfo();
    }
}

