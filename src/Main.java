public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Owner owner[] = new Owner[5];
        for (int i = 0; i < 5; i++) {
            owner[i] = new Owner();
        }
        int userInControl;
        while (true) {
            while (true) {
                System.out.println("\n\n\n\t\t\t\t\t******** Welcome to 'AqarMap' system ********\t\t\t\n\n\n\n");
                String choice = menu.firstMenu(); // choice of owner or client.
                if (choice.equals("1")) {
                    choice = menu.firstOwnerMenu(); // choice of signup or login.
                    if (choice.equals("1")) {
                        menu.SignUp(owner);
                        System.out.println("\t\t\t *****  Login  ***** \t\t\t\n");
                        userInControl = menu.Login(owner);
                        if (menu.out == true) {
                            continue;
                        }
                    } else {
                        userInControl = menu.Login(owner);
                        if (menu.out == true) {
                            continue;
                        }
                    }
                    choice = menu.secondOwnerMenu(); // Advertise for an apartment or edit an advertisement.
                    while (true) {
                        if (choice.equals("1")) {
                            owner[userInControl].apartmentData(owner[userInControl]);
                            break;
                        } else if (choice.equals("2")) {
                            owner[userInControl].editApartmentInfo(owner[userInControl]);
                            break;
                        }
                    }
                } else if (choice.equals("2")) {
                    System.out.println("Client menu here...");
                    break;
                }
            }
        }
    }
}
