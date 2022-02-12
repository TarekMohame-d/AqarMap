import java.util.Scanner;

public class Menu {
    String choice;
    boolean out;
    Scanner input = new Scanner(System.in);

    String firstMenu() {
        while (true) {
            System.out.println("Press 1 for owner or 2 for client");
            System.out.print("Choice : ");
            choice = input.nextLine();
            if (choice.equals("1") || choice.equals("2")) {
                break;
            } else
                System.out.println("Invalid choice...\n");
        }
        return choice;
    }

    String firstOwnerMenu() {
        String choice;
        while (true) {
            System.out.println("Press 1 to sign up or 2 to login");
            System.out.print("Choice : ");
            choice = input.nextLine();
            System.out.println("\n**********************************************************************\n");
            if (choice.equals("1") || choice.equals("2")) {
                break;
            } else
                System.out.println("Invalid choice...");
        }
        return choice;
    }

    String secondOwnerMenu() {
        String choice;
        while (true) {
            System.out.println("Press 1 to advertise for an apartment\nPress 2 to edit an advertisement");
            System.out.print("Choice : ");
            choice = input.nextLine();
            if (choice.equals("1") || choice.equals("2")) {
                break;
            } else
                System.out.println("Invalid choice...\n");
        }
        return choice;
    }

    String clientMenu() {
        String choice;
        while (true) {
            System.out.println(
                    "Press 1 to search by location\nPress 2 to search with certain price range\nPress 3 to search by payment method\nPress 4 to search by view");
            System.out.print("Choice : ");
            choice = input.nextLine();
            if (choice.equals("1") || choice.equals("2")) {
                break;
            } else
                System.out.println("Invalid choice...");
        }
        return choice;
    }

    void SignUp(Owner owner[]) {
        int ownerNumber = -1;
        for (int i = 0; i < 5; i++) {
            if (owner[i].ownerId == null)
                ownerNumber = i;
        }
        System.out.print("Enter your name : ");
        owner[ownerNumber].name = input.nextLine();
        System.out.println("\n**********************************************************************\n");
        System.out.print("Enter your password : ");
        owner[ownerNumber].password = input.nextLine();
        System.out.println("\n**********************************************************************\n");
        System.out.print("Phone : ");
        owner[ownerNumber].phone = input.nextLine();
        System.out.println("\n**********************************************************************\n");
        System.out.print("ID : ");
        owner[ownerNumber].ownerId = input.nextLine();
        System.out.println("\nWait signup in progress...");
        System.out.println("Signup successful\n\n");
        owner[ownerNumber].ownerCounter++;
    }

    int Login(Owner owner[]) {
        String tempUserName;
        String tempPassword;
        int userInControl = -1;
        String ans = "";
        boolean flag = true;
        while (flag) {
            System.out.print("Enter your username : ");
            tempUserName = input.nextLine();
            System.out.println("\n**********************************************************************\n");
            System.out.print("Enter your password : ");
            tempPassword = input.nextLine();
            for (int i = 0; i < 5; i++) {
                if (tempUserName.equals(owner[i].name) && tempPassword.equals(owner[i].password)) {
                    System.out.println(
                            " \n-------------------- Login successfully welcome to our system <3 --------------------\n\n");
                    flag = false;
                    userInControl = i;
                    break;
                }
            }
            if (flag != false) {
                System.out.println("\nIncorrect username or password\n");
            }
            while (flag) {
                System.out.println("Do you want to re-enter your username and password ( Y / N ) \n");
                System.out.print("Choice : ");
                ans = input.nextLine();
                System.out.print("\n----------------------------------------------------------------------\n");
                if (ans.equals("Y") || ans.equals("y") || ans.equals("N") || ans.equals("n")) {
                    break;
                } else {
                    System.out.println("Invalid answer...\n");
                }
            }
            if (ans.equals("Y") || ans.equals("y")) {
                continue;
            } else if (ans.equals("N") || ans.equals("n")) {
                out = true;
                break;
            }
        }
        flag = true;
        return owner[userInControl].ownerCounter;
    }
}