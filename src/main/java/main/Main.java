package main;

import java.util.Scanner;

import exceptions.InvalidAgeException;
import models.User;
import services.UserService;

public class Main {
    public static void main(String[] args) {

        UserService obj = new UserService();
        Scanner sc = new Scanner(System.in);
        // User user = new User("Adrin", 21);
        // User user2 = new User("Bershik", 10);
        int flag = 1;
        do {
            String userName;
            int age;
            System.out.println("Enter your name:");
            userName = sc.nextLine();
            System.out.println("Enter your age:");
            age = sc.nextInt();
            if (userName.equalsIgnoreCase("exit")) {
                flag = 0;
            } else {
                User user = new User(userName, age);
                try {
                    obj.registerUser(user);
                } catch (InvalidAgeException e) {
                    System.out.print("Registration failed: " + e.getMessage());
                }
            }
        } while (flag == 1);
        sc.close();
    }
}
