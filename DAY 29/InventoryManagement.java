import java.util.Scanner;

public class InventoryManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String itemName[] = new String[100];
        int quantity[] = new int[100];

        int count = 0;
        int choice;

        do {

            System.out.println("\n===== INVENTORY MANAGEMENT =====");
            System.out.println("1. Add Item");
            System.out.println("2. Display Items");
            System.out.println("3. Search Item");
            System.out.println("4. Update Quantity");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Item Name: ");
                    itemName[count] = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    quantity[count] = sc.nextInt();

                    count++;

                    System.out.println("Item Added Successfully.");
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("Inventory Empty.");
                    } else {

                        System.out.println("\nItem\tQuantity");

                        for (int i = 0; i < count; i++)
                            System.out.println(itemName[i] + "\t" + quantity[i]);
                    }

                    break;

                case 3:

                    System.out.print("Enter Item Name: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (itemName[i].equalsIgnoreCase(search)) {

                            System.out.println("Item Found");
                            System.out.println("Quantity = " + quantity[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Item Not Found.");

                    break;

                case 4:

                    System.out.print("Enter Item Name: ");
                    String update = sc.nextLine();

                    boolean updated = false;

                    for (int i = 0; i < count; i++) {

                        if (itemName[i].equalsIgnoreCase(update)) {

                            System.out.print("Enter New Quantity: ");
                            quantity[i] = sc.nextInt();

                            System.out.println("Quantity Updated.");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated)
                        System.out.println("Item Not Found.");

                    break;

                case 5:

                    System.out.println("Program Closed.");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);
    }
}