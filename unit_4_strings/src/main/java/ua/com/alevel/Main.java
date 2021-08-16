package ua.com.alevel;

import java.util.Scanner;

public class Main {

    final static String ERROR_MESSAGE = "Print the string, please!";
    final static String MAIN_MESSAGE = "Enter the main string: ";
    final static String RESULT = "Reversed string: ";

    public static void main(String[] args) {
        int choice = 1;
        while (choice != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nPlease, choose the option:" +
                    "\n1 - Reverse" +
                    "\n2 - Reverse all" +
                    "\n3 - Reverse with substring" +
                    "\n4 - Reverse with indexes" +
                    "\n0 - Exit" +
                    "\nyour option -> ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                e.printStackTrace();
            }

            switch (choice) {
                case 1: {
                    System.out.print(MAIN_MESSAGE);
                    String str = scanner.nextLine();
                    System.out.print(RESULT + StringReverse.reverseAll(str, false));
                    break;
                }
                case 2: {
                    System.out.print(MAIN_MESSAGE);
                    String str = scanner.nextLine();
                    if (str.isEmpty()) {
                        System.out.println(ERROR_MESSAGE);
                        break;
                    }
                    System.out.print(RESULT + StringReverse.reverseAll(str, true));
                    break;
                }
                case 3: {
                    System.out.print(MAIN_MESSAGE);
                    String str = scanner.nextLine();
                    if (str.isEmpty()) {
                        System.out.println(ERROR_MESSAGE);
                        break;
                    }
                    System.out.println("Enter the substring to reverse:");
                    String target = scanner.nextLine();
                    System.out.print(RESULT + StringReverse.reverseSubstring(str, target));
                    break;
                }
                case 4: {
                    System.out.print(MAIN_MESSAGE);

                    String str = scanner.nextLine();
                    if (str.isEmpty()) {
                        System.out.println(ERROR_MESSAGE);
                        break;
                    }
                    System.out.print("Enter the first index: ");
                    int start = scanner.nextInt();
                    System.out.print("Enter the second index: ");
                    int end = scanner.nextInt();
                    System.out.print(RESULT + StringReverse.reverseWithIndex(str, start, end));
                    break;
                }
                case 0: {
                    System.out.println("Cheers!");
                    break;
                }
                default: {
                    System.out.println("Select a correct option");
                }
            }
        }
    }
}
