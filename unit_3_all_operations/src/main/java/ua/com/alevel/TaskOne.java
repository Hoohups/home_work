package ua.com.alevel;

import java.util.Scanner;

public class TaskOne {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something with numbers so that I can calculate their sum:");

        String str = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum = sum + Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println("Their sum  = " + sum);
    }
}
