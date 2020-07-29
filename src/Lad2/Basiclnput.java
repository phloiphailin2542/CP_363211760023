package Lad2;

import java.util.Scanner;


public class Basiclnput {
    public static void main(String[]  args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter you name ?: ");
        String name = scanner.nextLine();

        System.out.print("อายุเท่าไร ?: ");
        int age = scanner.nextInt();
        System.out.println("อายุของคุณคือ" + age);

        System.out.println("Enter you nick name ?: ");
        String nickname = scanner.nextLine();
        System.out.println("you nick name in "+name);

    }//main
}
