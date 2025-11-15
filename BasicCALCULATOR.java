import java.util.Scanner;

public class BasicCALCULATOR {
    public static void main(String[] args){

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter Your First Number: ");
        int b = input2.nextInt();
        System.out.println("Your First Number: " + b);

        Scanner input4 = new Scanner(System.in);
        System.out.print("Enter Your Second Number: ");
        int d = input4.nextInt();
        System.out.println("Your Second Number: " + d);



        Scanner input3 = new Scanner(System.in);
        System.out.print("+, -, *, /, Enter Your Process: ");
        String c = input3.next();
        System.out.println("Your Process: " + c);

        if (c.equals ("+")) {
            int result = b+d;
            System.out.println("Your Result: " + result);
        }

        else if (c.equals ("-")) {
            int result = b-d;
            System.out.println("Your Result: " + result);
        }

        else if (c.equals ("*")) {
            int result = b*d;
            System.out.println("Your Result: " + result);
        }

        else if (c.equals ("/")) {
            int result = b/d;
            System.out.println("Your Result: " + result);
        }

        else {
            System.out.println("Please Enter Correct Procces");
        }
    }
}


