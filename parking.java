import java.util.Scanner;

class VehicleManagement {
    // Global variables
    static int nor = 0, nob = 0, noc = 0, amount = 0, count = 0;
    static int amountChange = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            clearScreen();
            System.out.println("=======================================================");
            System.out.printf("| %-15s | %-15s | %-15s |%n", "Vehicle Type", "Number of Vehicles", "Amount Change");
            System.out.println("=======================================================");
            showDetail();
            System.out.println("=======================================================");
            switch (menu(scanner)) {
                case 1:
                    showDetail();
                    break;
                case 2:
                    bus();
                    break;
                case 3:
                    cycle();
                    break;
                case 4:
                    riksha();
                    break;
                case 5:
                    deleteData();
                    break;
                case 6:
                    deleteBus();
                    break;
                case 7:
                    deleteCycle();
                    break;
                case 8:
                    deleteRiksha();
                    break;
                case 9:
                    deleteAll();
                    break;
                case 10:
                    deleteAllBuses();
                    break;
                case 11:
                    deleteAllCycles();
                    break;
                case 12:
                    deleteAllRikshas();
                    break;
                case 13:
                    System.exit(0);
                default:
                    System.out.println("Sorry, Invalid Choice.");
            }
            scanner.nextLine(); // Consume newline character
            scanner.nextLine(); // Wait for user to press Enter
        }
    }

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void showDetail() {
        System.out.printf("| %-15s | %-15d | %-15d |%n", "Bus", nob, nob * 100);
        System.out.printf("| %-15s | %-15d | %-15d |%n", "Cycle", noc, noc * 20);
        System.out.printf("| %-15s | %-15d | %-15d |%n", "Riksha", nor, nor * 50);
        System.out.printf("| %-15s | %-15d | %-15d |%n", "Total", count, amountChange);
        System.out.printf("| %-15s | %-15d | %-15d |%n", "Amount", amount, amountChange);
    }

    static int menu(Scanner scanner) {
        System.out.println("1. Show Status");
        System.out.println("2. Enter entry for Bus");
        System.out.println("3. Enter entry for Cycle");
        System.out.println("4. Enter entry for Riksha");
        System.out.println("5. Delete All Data");
        System.out.println("6. Delete the record for one Bus");
        System.out.println("7. Delete the record for one Cycle");
        System.out.println("8. Delete the record for one Riksha");
        System.out.println("9. Delete the record for All Vehicles");
        System.out.println("10. Delete the record for All Buses");
        System.out.println("11. Delete the record for All Cycles");
        System.out.println("12. Delete the record for All Rikshas");
        System.out.println("13. Exit");
        System.out.println("\nEnter your choice:");
        return scanner.nextInt();
    }

    static void deleteData() {
        amountChange -= amount;
        nob = 0;
        noc = 0;
        nor = 0;
        amount = 0;
        count = 0;
        System.out.println("All data deleted successfully.");
    }

    static void deleteBus() {
        if (nob > 0) {
            amountChange -= nob * 100;
            nob--;
            count--;
            System.out.println("Entry for bus is deleted successfully.");
        } else {
            System.out.println("No Bus is in the queue to be deleted.");
        }
    }

    static void deleteCycle() {
        if (noc > 0) {
            amountChange -= noc * 20;
            noc--;
            count--;
            System.out.println("Entry for Cycle is deleted successfully.");
        } else {
            System.out.println("No Cycle is in the queue to be deleted.");
        }
    }

    static void deleteRiksha() {
        if (nor > 0) {
            amountChange -= nor * 50;
            nor--;
            count--;
            System.out.println("Entry for Riksha is deleted successfully.");
        } else {
            System.out.println("No Riksha is in the queue to be deleted.");
        }
    }

    static void deleteAll() {
        amountChange -= amount;
        nob = 0;
        noc = 0;
        nor = 0;
        amount = 0;
        count = 0;
        System.out.println("All data deleted successfully.");
    }

    static void deleteAllBuses() {
        amountChange -= nob * 100;
        nob = 0;
        System.out.println("All bus data deleted successfully.");
    }

    static void deleteAllCycles() {
        amountChange -= noc * 20;
        noc = 0;
        System.out.println("All cycles data deleted successfully.");
    }

    static void deleteAllRikshas() {
        amountChange -= nor * 50;
        nor = 0;
        System.out.println("All rikshas data deleted successfully.");
    }

    static void riksha() {
        amountChange += 50;
        nor++;
        count++;
        System.out.println("Entry Successful");
    }

    static void cycle() {
        amountChange += 20;
        noc++;
        count++;
        System.out.println("Entry Successful");
    }

    static void bus() {
        amountChange += 100;
        nob++;
        count++;
        System.out.println("Entry Successful");
    }
}
