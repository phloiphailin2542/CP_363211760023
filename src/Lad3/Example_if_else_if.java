package Lad3;


import java.util.Scanner;

public class Example_if_else_if {
    public static void  main(String [] args) {
        Scanner Scanner = new Scanner(System.in);

        // input score
        System.out.print("Enter you score");
        double score = scanner.nextDoubole();
        //test condition
        // F  = 0 - 49.99
        // D  = 50 - 54.99
        // D+ = 55.00 - 59.99
        // c  = 60.00 - 64.99
        // c+ = 65.00 - 69.99
        // B  = 70.00 - 74.99
        // B+ = 75.00 - 79.99
        // A  = 80.00 - 100.00
        if (score >= 0 && score <= 49.99) {
            System.out.println("You grade is F.");
        } else if (score >= 50.00 && score <= 54.99) {
            System.out.println("You grade is D.");
        } else if (score >= 55.00 && score <= 59.99) {
            System.out.println("You grade is D+.");
        } else if (score >= 60.00 && score <= 64.99) {
            System.out.println("You grade is c.");
        } else if (score >= 65.00 && score <= 69.99) {
            System.out.println("You grade is c+.");
        } else if (score >= 70.00 && score <= 74.99) {
            System.out.println("You grade is B.");
        } else if (score >= 75.00 && score <= 79.99) {
            System.out.println("You grade is B+.");
        } else if (score >= 80.00 && score <= 100.00) {
            System.out.println("You grade is A");
        }



    }
}