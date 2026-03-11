package DigitalCom;

import java.util.List;
import java.util.Scanner;

public class DigitalComProcesses {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserClass user = new UserClass();
        GameServices service = new GameServices();

        boolean isLoggedIn = false;
        int choice;

        while (true) {

            System.out.println("\n===== DigitalCom Portal =====");
            System.out.println("1) RegisterUser");
            System.out.println("2) Login");
            System.out.println("3) ViewGames");
            System.out.println("4) SearchByAuthor");
            System.out.println("5) Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter User Name: ");
                    String UserId = sc.nextLine();
                    System.out.print("Enter Password: ");
                    String pwd = sc.nextLine();

                    user.addUser(UserId, pwd);
                    break;

                case 2:
                    System.out.print("Enter User Name: ");
                    String loginId = sc.nextLine();
                    System.out.print("Enter Password: ");
                    String loginPwd = sc.nextLine();

                    if (user.IsAuthenticated(loginId, loginPwd)) {
                        isLoggedIn = true;
                        System.out.println("Login Successful!");
                    } else {
                        System.out.println("Invalid Credentials!");
                    }
                    break;

                case 3:
                    if (isLoggedIn) {
                        List<Game> gameList = service.viewAll();
                        gameList.forEach(System.out::println);
                    } else {
                        System.out.println("Access Denied! Please Login First.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();
                    String result = service.authorSearch(author);
                    System.out.println("Result: " + result);
                    break;

                case 5:
                    System.out.println("Exiting Application...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}