package exerase;

import sun.security.util.Password;

import java.util.Scanner;

public class Excercise_Leb_3_Longin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String Username = "mit212";
        String password = "1234";


        int count =0;
        do{
            System.out.print("Username: ");
            String u = sc.nextLine();
            System.out.print("password: ");
            String p = sc.nextLine();
            if (u.equals(Username)&& p.equals(password)){
                System.out.println("Welcome to MT System.");
                break;
            }else {
                System.out.println("Username or Password is not corrected.");
                count++;
                if (count == 3) {
                    System.out.println("Your account has been locked. Please, contact Admin");
                }
            }
        }while (count<3) ;
    }
}
