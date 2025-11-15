import java.util.Scanner;

public class debuggingTest2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students? ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] names = new String[n];
        double[] grades = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i+1) + " name: ");
            names[i] = scanner.nextLine();
            System.out.print("Student " + (i+1) + " grade: ");
            grades[i] = scanner.nextInt();
            scanner.nextLine();
        }

        double total = 0;
        for (int i = 0; i < n; i++) {
            total += grades[i];
        }
        double average = total / n;
        System.out.println("Class average: " + average);

        System.out.println("Students with above average grades:");
        for (int i = 0; i < n; i++) {
            if (grades[i] > average)
                System.out.println(names[i] + ": " + grades[i]);
        }

        System.out.println("Program ended.");
    }
}
