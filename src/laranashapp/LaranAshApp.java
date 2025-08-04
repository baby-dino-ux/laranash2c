package laranashapp;

import java.util.Scanner;
import bank.banking;

public class LaranAshApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int attempt = 3;
                boolean loginsuccess = false;

                banking bc = new banking();
                while (attempt > 0 && !loginsuccess) {

                    System.out.println("Enter your Account No: ");
                    int accountNo = sc.nextInt();

                    System.out.println("Enter your Pin: ");
                    int pin = sc.nextInt();

                    if (bc.verifyAccount(accountNo, pin)) {
                        System.out.println("LOGIN SUCCESS");
                        loginsuccess = true;
                    } else {
                        attempt--;
                        if (attempt > 0) {
                            System.out.println("INVALID ACCOUNT! You have " + attempt + " attempt(s) remaining.");
                        } else {
                            System.out.println("Access denied.");
                            System.exit(0);
                        }
                    }
                }

                break;
            case 2:

                break;
            case 3:

                break;
            default:
                System.out.println("Invalid Selection!");

        }
    }
}
