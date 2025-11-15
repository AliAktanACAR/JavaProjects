import java.util.Scanner;

public class debuggingTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 7;
        int guess;

        System.out.println("Guess a number between 1 and 10:");
        guess = scanner.nextInt();

        if (guess == secretNumber) { // HATA: '=' yerine '==' olmalı
            System.out.println("Correct!");
        } else if (guess > secretNumber) {
            System.out.println("Too high!");
        } else
            System.out.println("Too low!"); // Mantıksal hata yok ama else parantezi eksik olabilir

        System.out.println("Thanks for playing!");

    }
}

