package laranashapp;

import java.util.Scanner;

public class oddapp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, rem;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        rem = num % 2;

        if (num == 0) {
            System.out.println("Inputted number Zero");
        } else if (rem == 0) {
            System.out.println("Inputted number is Even");
        } else {
            System.out.println("Inputted number is Odd");
        }

    }
}

