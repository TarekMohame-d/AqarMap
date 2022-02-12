public class Owner extends ApartmentInfo {
    String name;
    String password;
    String phone;
    // static int counter = 0;
    String ownerId;
    static int ownerCounter = 0;
    ApartmentInfo apartmentInfo[] = new ApartmentInfo[5];

    public void apartmentData(Owner owner) {
        int choice;
        int apartmentNum = 0; // Number of owner apartments.
        while (true) {
            for (int i = 0; i < 5; i++) {
                if (owner.apartmentInfo[i] == null) {
                    owner.apartmentInfo[i] = new ApartmentInfo();
                    apartmentNum = i;
                    break;
                }
            }
            System.out.println("\n**********************************************************************\n");
            System.out.print("Apartment ID : ");
            owner.apartmentInfo[apartmentNum].apartmentId = input.nextLine();
            System.out.println("\n**********************************************************************\n");
            System.out.print("Apartment location --->\n");
            System.out.print("City : ");
            owner.apartmentInfo[apartmentNum].apartmentCity = input.nextLine();
            System.out.print("\nStreet : ");
            owner.apartmentInfo[apartmentNum].apartmentStreet = input.nextLine();
            System.out.println("\n**********************************************************************\n");
            System.out.print("Price : ");
            owner.apartmentInfo[apartmentNum].price = input.nextInt();
            input.nextLine();
            System.out.println("\n**********************************************************************\n");
            System.out.print("View : ");
            owner.apartmentInfo[apartmentNum].view = input.nextLine();
            System.out.println("\n**********************************************************************\n");
            while (true) {
                System.out.println("Payment method -->\nPress 1 for cash\nPress 2 for installments");
                choice = input.nextInt();
                input.nextLine();
                if (choice == 1) {
                    owner.apartmentInfo[apartmentNum].paymentMethod = "Cash";
                    break;
                } else if (choice == 2) {
                    owner.apartmentInfo[apartmentNum].paymentMethod = "Installments";
                    owner.apartmentInfo[apartmentNum].apartmentInstallments = true;
                    System.out.print("Apartment Down payment : ");
                    owner.apartmentInfo[apartmentNum].downPayment = input.nextInt();
                    input.nextLine();
                    System.out.println("\n**********************************************************************\n");
                    System.out.print("Apartment installments years : ");
                    owner.apartmentInfo[apartmentNum].installmentsYears = input.nextLine();
                    break;
                } else {
                    System.out.println("\nInvalid choice please re-enter your choice...\n");
                }
            }
            System.out.println("\n------------------ Apartment number " + (apartmentNum + 1)
                    + " added successfully ------------------");
            System.out.println("\nDo you want to add another apartment ? ( Y / N )");
            String answer = input.nextLine();
            if (answer.equals("Y") || answer.equals("y")) {
                continue;
            } else {
                break;
            }
        }
    }

    void editApartmentInfo(Owner owner) {
        int choice;
        boolean flag = false;
        boolean flag2 = true;
        int apartmentNumber = 0;
        while (flag2 == true) {
            System.out.println("\nEnter the id of the apartment you want to edit : ");
            String id = input.nextLine();
            for (int i = 0; i < 5; i++) {
                if (owner.apartmentInfo[i].apartmentId.equals(id)) {
                    flag = true;
                    flag2 = false;
                    apartmentNumber = i;
                    break;
                }
            }
            if (flag == false) {
                System.out.println("\nThere is no apartment with this id...");
            }
            while (flag == false) {
                System.out.println("\nDo you want to try again ? ( Y / N )");
                String ans = input.nextLine();
                if (ans.equals("Y") || ans.equals("y")) {
                    flag2 = true;
                    break;
                } else {
                    flag2 = false;
                    break;
                }
            }
        }
        if (flag == true) {
            while (true) {
                System.out.println("\n**********************************************************************\n");
                System.out.print("Apartment ID : ");
                owner.apartmentInfo[apartmentNumber].apartmentId = input.nextLine();
                System.out.println("\n**********************************************************************\n");
                System.out.print("Apartment location --->\n");
                System.out.print("City : ");
                owner.apartmentInfo[apartmentNumber].apartmentCity = input.nextLine();
                System.out.print("\nStreet : ");
                owner.apartmentInfo[apartmentNumber].apartmentStreet = input.nextLine();
                System.out.println("\n**********************************************************************\n");
                System.out.print("Price : ");
                owner.apartmentInfo[apartmentNumber].price = input.nextInt();
                input.nextLine();
                System.out.println("\n**********************************************************************\n");
                System.out.print("View : ");
                owner.apartmentInfo[apartmentNumber].view = input.nextLine();
                System.out.println("\n**********************************************************************\n");
                while (true) {
                    System.out.println("Payment method -->\nPress 1 for cash\nPress 2 for installments");
                    choice = input.nextInt();
                    input.nextLine();
                    if (choice == 1) {
                        owner.apartmentInfo[apartmentNumber].paymentMethod = "Cash";
                        break;
                    } else if (choice == 2) {
                        owner.apartmentInfo[apartmentNumber].paymentMethod = "Installments";
                        owner.apartmentInfo[apartmentNumber].apartmentInstallments = true;
                        System.out.print("Apartment Down payment : ");
                        owner.apartmentInfo[apartmentNumber].downPayment = input.nextInt();
                        input.nextLine();
                        System.out
                                .println("\n**********************************************************************\n");
                        System.out.print("Apartment installments years : ");
                        owner.apartmentInfo[apartmentNumber].installmentsYears = input.nextLine();
                        break;
                    } else {
                        System.out.println("Invalid choice please re-enter your choice...");
                    }
                }
                break;
            }
        }
    }
}
