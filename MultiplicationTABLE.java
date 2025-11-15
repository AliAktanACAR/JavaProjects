import java.util.Scanner;

public class MultiplicationTABLE {
    public static void main(String[] args) {
        while (true) {
            System.out.println("##### Take A Square or Multiplication Table #####");
            System.out.println();

            Scanner input1 = new Scanner(System.in);
            System.out.print("Enter Your Process: ");
            String process = input1.nextLine();

            System.out.print("Enter Your Number For The Take A Square or Multiplication Table: ");
            int number = input1.nextInt();

            if (process.equalsIgnoreCase("Multiplication Table")) {
                for (int i = 1; i <= 10; i++) {
                    int result = number * i;
                    System.out.println(number + " x " + i + " = " + result);
                }
            }

            else if (process.equalsIgnoreCase("Take A Square")) {
                int result2 = number * number;
                System.out.println(number + " ^ 2 = " + result2);
            }

            else {
                System.out.println("Invalid Input");
            }
        }
    }
}
