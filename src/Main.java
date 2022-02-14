public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Client client = new Client();
        Owner owner[] = new Owner[5];
        for (int i = 0; i < 5; i++) {
            owner[i] = new Owner();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                owner[i].apartmentInfo[j] = new ApartmentInfo();
            }
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
                        if (menu.out == true) { // User doesn't want to login
                            continue;
                        }
                    } else {
                        userInControl = menu.Login(owner);
                        if (menu.out == true) { // User doesn't want to login
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
                    choice = menu.clientMenu();
                    switch (choice) {
                        case "1":
                            client.searchByLocation(owner);
                            break;
                        case "2":
                            client.searchByPriceRange(owner);
                            break;
                        case "3":
                            client.searchByPayment_method(owner);
                        case "4":
                            client.searchByView(owner);
                    }
                }
            }
        }
    }
}
