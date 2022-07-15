package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


            int count = 0;
            System.out.println("Please create a password: ");
            Scanner scanner = new Scanner(System.in);
            String password = scanner.nextLine();
            do{
                if(password == "" || password == null){
                    System.out.println("Please enter letters or numbers: ");
                    password = scanner.nextLine();
                }


            } while (password == "" || password == null);

            System.out.println("Password created");

            do {
                System.out.println("Please enter your password: ");
                String checkPassword = scanner.nextLine();
                if (password.equals(checkPassword)){
                    count = 4;
                    System.out.println("Thank you for entering correct password.");
                } else {
                    count++;
                    if (count < 3) {
                        System.out.println("Wrong password please try again");
                    }
                    if (count == 3) {
                        System.out.println("Wrong password enter too many times!");
                    }
                }

            } while (count < 3);

            scanner.close();

    }
}
