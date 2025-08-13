package laranashapp;

import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int sciences, history, math, soc, arts;

        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter marks in Science: ");
        sciences = sc.nextInt();
        System.out.print("Enter marks in History: ");
        history = sc.nextInt();
        System.out.print("Enter marks in Math: ");
        math = sc.nextInt();
        System.out.print("Enter marks in Soc: ");
        soc = sc.nextInt();
        System.out.println("Enter marks in Arts: ");
        arts = sc.nextInt();

        int marks = sciences + history + math + soc + arts;
        System.out.println("Total Marks: " + marks);

        float percentage = marks / 5.0f;
        System.out.printf("\nTotal Percentage: %.2f\n", percentage);

        String remarks;

        if (percentage < 70) {
            remarks = "Fail";
        } else if (percentage >= 70 && percentage <= 75) {
            remarks = "Poor";
        } else if (percentage >= 76 && percentage <= 80) {
            remarks = "Fair";
        } else if (percentage >= 81 && percentage <= 85) {
            remarks = "Good";
        } else if (percentage >= 86 && percentage <= 90) {
            remarks = "Very Good";
        } else if (percentage >= 91 && percentage <= 100) {
            remarks = "Excellent";
        } else {
            remarks = "Invalid";
        }

        System.out.println("Remarks : " +remarks);

        if (percentage >= 70) {

            System.out.println("Congrats "+name+" you Passed.");

        } else {
            System.out.println("Try Again");
        }

    }

}