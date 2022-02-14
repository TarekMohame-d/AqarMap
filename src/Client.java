import java.util.Scanner;

public class Client extends Owner {
    Scanner input = new Scanner(System.in);

    void searchByLocation(Owner owner[]) {
        int counter = 1;
        boolean found = false;
        while (found == false) {
            System.out.print("\nEnter the location of the city you want to search by : ");
            String city = input.nextLine();
            for (int ownerNumber = 0; ownerNumber < 5; ownerNumber++) {
                for (int apartmentNumber = 0; apartmentNumber < 5; apartmentNumber++) {
                    if (owner[ownerNumber].apartmentInfo[apartmentNumber].apartmentCity != null) {
                        if (owner[ownerNumber].apartmentInfo[apartmentNumber].apartmentCity.equals(city)) {
                            System.out
                                    .println(
                                            "\n**********************************************************************\n");
                            System.out.println("-------------------------- Apartment " + (counter)
                                    + " that exist with this location --------------------------\n\n");
                            Client.super.displayApartment(owner[ownerNumber], apartmentNumber);
                            counter++;
                            found = true;
                        }
                    }
                }
            }
            if (found == true) {
                System.out.println("Do you want to Search again ? ( Y / N )");
                String ans = input.nextLine();
                if (ans.equals("Y") || ans.equals("y")) {
                    counter = 1;
                    found = false;
                    continue;
                } else {
                    break;
                }
            }
            if (found == false) {
                System.out.println("\nApartment with this location does not exists....\n");
                System.out.println("\n**********************************************************************\n");
                System.out.println("Do you want to try again ( Y / N )");
                String ans = input.nextLine();
                if (ans.equals("Y") || ans.equals("y")) {
                    counter = 1;
                    continue;
                } else {
                    break;
                }
            }
        }
    }

    void searchByPriceRange(Owner owner[]) {
        int counter = 1;
        double firstRange, secondRange;
        boolean found = false;
        while (found == false) {
            System.out.print("\nEnter the price range you want to search by...\n");
            System.out.print("First range : ");
            firstRange = input.nextDouble();
            System.out.print("\nSecond range : ");
            secondRange = input.nextDouble();
            for (int ownerNumber = 0; ownerNumber < 5; ownerNumber++) {
                for (int apartmentNumber = 0; apartmentNumber < 5; apartmentNumber++) {
                    if (owner[ownerNumber].apartmentInfo[apartmentNumber].apartmentId != null) {
                        if (owner[ownerNumber].apartmentInfo[apartmentNumber].price >= firstRange
                                && owner[ownerNumber].apartmentInfo[apartmentNumber].price <= secondRange) {
                            System.out
                                    .println(
                                            "\n**********************************************************************\n");
                            System.out.println("-------------------------- Apartment " + (counter)
                                    + " that exist with this price range --------------------------\n\n");
                            Client.super.displayApartment(owner[ownerNumber], apartmentNumber);
                            counter++;
                            found = true;
                        }
                    }
                }
            }
            if (found == true) {
                System.out.println("Do you want to Search again ? ( Y / N )");
                String ans = input.nextLine();
                if (ans.equals("Y") || ans.equals("y")) {
                    counter = 1;
                    found = false;
                    continue;
                } else {
                    break;
                }
            }
            if (found == false) {
                System.out.println("\nApartments with this price range does not exists....\n");
                System.out.println("\n**********************************************************************\n");
                System.out.println("Do you want to try again ( Y / N )");
                String ans = input.nextLine();
                if (ans.equals("Y") || ans.equals("y")) {
                    counter = 1;
                    continue;
                } else {
                    break;
                }
            }
        }
    }

    void searchByPayment_method(Owner owner[]) {
        int counter = 1;
        boolean found = false;
        String ans;
        while (found == false) {
            while (true) {
                System.out.println("Enter the payment method you want to search by : ");
                System.out.println("1) for Cash");
                System.out.println("2) for installment");
                System.out.print("Choice : ");
                ans = input.nextLine();
                if (ans.equals("1") || ans.equals("2")) {
                    break;
                } else {
                    System.out.println("Invalid choice...\n");
                }
            }
            if (ans.equals("1")) {
                for (int ownerNumber = 0; ownerNumber < 5; ownerNumber++) {
                    for (int apartmentNumber = 0; apartmentNumber < 5; apartmentNumber++) {
                        if (owner[ownerNumber].apartmentInfo[apartmentNumber].apartmentCity != null) {
                            if (owner[ownerNumber].apartmentInfo[apartmentNumber].paymentMethod.equals("Cash")) {
                                System.out
                                        .println(
                                                "\n**********************************************************************\n");
                                System.out.println("-------------------------- Apartment " + (counter)
                                        + " that exist with this payment method --------------------------\n\n");
                                Client.super.displayApartment(owner[ownerNumber], apartmentNumber);
                                counter++;
                                found = true;
                            }
                        }
                    }
                }
            } else if (ans.equals("2"))
                for (int ownerNumber = 0; ownerNumber < 5; ownerNumber++) {
                    for (int apartmentNumber = 0; apartmentNumber < 5; apartmentNumber++) {
                        if (owner[ownerNumber].apartmentInfo[apartmentNumber].apartmentCity != null) {
                            if (owner[ownerNumber].apartmentInfo[apartmentNumber].paymentMethod
                                    .equals("Installments")) {
                                System.out
                                        .println(
                                                "\n**********************************************************************\n");
                                System.out.println("-------------------------- Apartment " + (counter)
                                        + " that exist with this payment method --------------------------\n\n");
                                Client.super.displayApartment(owner[ownerNumber], apartmentNumber);
                                counter++;
                                found = true;
                            }
                        }
                    }
                }
            if (found == true) {
                System.out.println("Do you want to Search again ? ( Y / N )");
                ans = input.nextLine();
                if (ans.equals("Y") || ans.equals("y")) {
                    counter = 1;
                    found = false;
                    continue;
                } else {
                    break;
                }
            }
        }
    }

    void searchByView(Owner owner[]) {
        int counter = 1;
        boolean found = false;
        while (found == false) {
            System.out.print("\nEnter the view of the apartment you want to search by : ");
            String view = input.nextLine();
            for (int ownerNumber = 0; ownerNumber < 5; ownerNumber++) {
                for (int apartmentNumber = 0; apartmentNumber < 5; apartmentNumber++) {
                    if (owner[ownerNumber].apartmentInfo[apartmentNumber].apartmentCity != null) {
                        if (owner[ownerNumber].apartmentInfo[apartmentNumber].view.equals(view)) {
                            System.out
                                    .println(
                                            "\n**********************************************************************\n");
                            System.out.println("-------------------------- Apartment " + (counter)
                                    + " that exist with this view --------------------------\n\n");
                            Client.super.displayApartment(owner[ownerNumber], apartmentNumber);
                            counter++;
                            found = true;
                        }
                    }
                }
            }
            if (found == true) {
                System.out.println("Do you want to Search again ? ( Y / N )");
                String ans = input.nextLine();
                if (ans.equals("Y") || ans.equals("y")) {
                    counter = 1;
                    found = false;
                    continue;
                } else {
                    break;
                }
            }
            if (found == false) {
                System.out.println("\nApartment with this view does not exists....\n");
                System.out.println("\n**********************************************************************\n");
                System.out.println("Do you want to try again ( Y / N )");
                String ans = input.nextLine();
                if (ans.equals("Y") || ans.equals("y")) {
                    counter = 1;
                    continue;
                } else {
                    break;
                }
            }
        }
    }
}
