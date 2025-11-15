import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
                
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Your Number: ");
    int a = input.nextInt();
    System.out.println("Your Number: " + a);


    if (a % 2 == 0) {
        System.out.println( a + " 2 ile bölünebiliyor");
    }
    else if (a % 3 == 0) {
        System.out.println( a + " 3 ile bölünebiliyor");
    }
    else{
        System.out.println( a + " 2 yada 3 ile bölünemiyor");
    }
    */

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
