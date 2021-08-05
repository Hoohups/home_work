package ua.com.alevel;

import java.util.Scanner;

public class TaskThree {

    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me what lesson you want to skip and I'll tell you what time it starts:");

        String str = scanner.nextLine();

        int x = Integer.parseInt(str);
        int resultSecondsTotal = x * 45 + (x / 2) * 5 + ((x + 1) / 2 - 1) * 15;
        System.out.println(resultSecondsTotal / 60 + 9 + ":" + resultSecondsTotal % 60);
    }
}
