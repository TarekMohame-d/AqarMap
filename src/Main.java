public class Main {
    static int numberOfOwners = 0;
    public static void main(String[] args) {
        Menu menu = new Menu();
        Owner owner[] = new Owner[5];
        for (int i = 0; i < 5; i++) {
            owner[i] = new Owner();
        }
        while (true) {
            while (true) {
                System.out.println("\n\n\n\t\t\t\t\t******** Welcome to 'AqarMap' system ********\t\t\t\n\n\n\n");
                String choice = menu.firstMenu(); // choice of owner or client.
                if (choice.equals("1")) {
                    choice = menu.firstOwnerMenu(); // choice of signup or login.
                    if (choice.equals("1")) {
                        menu.SignUp(owner[numberOfOwners]);
                        numberOfOwners++;
                        System.out.println("\t\t\t *****  Login  ***** \t\t\t\n");
                        choice = menu.Login(owner);
                        if (choice.equals("Out")) {
                            continue;
                        }
                    } else {
                        choice = menu.Login(owner);
                        if (choice.equals("Out")) {
                            continue;
                        }
                    }
                    choice = menu.secondOwnerMenu(); // Advertise for an apartment or edit an advertisement.
                    while (true) {
                        if (choice.equals("1")) {
                            owner[numberOfOwners-1].apartmentData(owner[numberOfOwners-1]);
                            break;
                        } else if(choice.equals("2")) {
                            owner[numberOfOwners-1].editApartmentInfo(owner[numberOfOwners-1]);
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
