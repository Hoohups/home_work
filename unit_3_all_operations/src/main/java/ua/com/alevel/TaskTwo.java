package ua.com.alevel;

import java.util.Scanner;

public class TaskTwo {

    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's's your favorite quote? Type it in and I'll count the occurrence of each letter:");

        String str = scanner.nextLine();
        int counter[] = new int[256];

        for (int i = 0; i < str.length(); i++) {
            counter[str.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + " -- " + counter[i]);
            }
        }
    }
}
