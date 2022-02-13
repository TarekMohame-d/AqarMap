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
}
