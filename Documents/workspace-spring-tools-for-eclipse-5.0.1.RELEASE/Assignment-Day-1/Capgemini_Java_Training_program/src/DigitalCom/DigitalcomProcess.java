package DigitalCom;

import java.util.List;
import java.util.Scanner;

public class DigitalcomProcess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserClass user = new UserClass();
        GameServices service = new GameServices();

        int choice;

        while (true) {

            System.out.println("\n===== DigitalCom Portal =====");
            System.out.println("1.) RegisterUser");
            System.out.println("2.) ViewGames");
            System.out.println("3.) SearchByAuthor");
            System.out.println("4.) Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter User ID: ");
                    String UserId = sc.nextLine();
                    System.out.print("Enter Password: ");
                    String pwd = sc.nextLine();

                    user.addUser(UserId, pwd);
                    break;

                case 2:
                    List<Game> gameList = service.viewAll();
                    gameList.forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    String result = service.authorSearch(author);
                    System.out.println("Result: " + result);
                    break;

                case 4:
                    System.out.println("Exiting Application...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
