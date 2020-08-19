package exerase;


import java.util.Scanner;

public class chapten4_1 {
    public static void main (String[] args ){
        Scanner Scanner = new Scanner(System.in);


        System.out.print("Enter a test 1: ");
        int a = Scanner.nextInt();
        System.out.print("Enter b test 2: ");
        int b = Scanner.nextInt();
        System.out.print("Enter c test 3: ");
        int c = Scanner.nextInt();
        System.out.print("Enter d test 4: ");
        int d = Scanner.nextInt();
        System.out.print("Enter f test 5: ");
        int f = Scanner.nextInt();
        System.out.print("Enter e test 6: ");
        int e = Scanner.nextInt();
        System.out.print("Enter m test 7: ");
        int m = Scanner.nextInt();
        System.out.print("Enter y test 8: ");
        int y = Scanner.nextInt();
        System.out.print("Enter u test 9: ");
        int u = Scanner.nextInt();
        System.out.print("Enter k test 10: ");
        int k = Scanner.nextInt();

        int total = a + b + c + d + f + e + m + y + u + k;
        int avg = total / 10;
         //display result
        System.out.println("Total : " + total);
        System.out.println("Average : " + avg);





    }



}


