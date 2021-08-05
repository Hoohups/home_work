package ua.com.alevel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choice = 1;
        String finalDecision = "";
        while (choice != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, choose a task number from 1 to 3, if you choose 0, you'll start 3d WW: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
            switch (choice) {
                case 0: {
                    System.out.println("A great choice!");
                }break;
                case 1: {
                    new TaskOne().run();
                }break;
                case 2: {
                    new TaskTwo().run();
                }break;
                case 3: {
                    new TaskThree().run();
                }break;
                default: {

                }
            }

            if (choice != 0) {
                System.out.println("You're done? I'm tired. Y/N");
                finalDecision = scanner.nextLine();

                switch (finalDecision.toUpperCase()) {
                    case "Y": {
                        System.out.println("Cheers!");
                        choice = 0;
                    }break;
                    case "N": {
                        System.out.println("I knew you wouldn't let me go...");
                    }break;
                    default: {
                        System.out.println("What's wrong with you?");
                    }
                }
            }

        }
    }
}
