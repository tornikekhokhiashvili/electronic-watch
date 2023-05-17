package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int hours = (seconds / 3600)%24;
        int minutes = (seconds / 60) % 60;
        int remainingSeconds = seconds % 60;

        String formattedTime = String.format("%d:%02d:%02d", hours, minutes, remainingSeconds);
        System.out.println(formattedTime);
    }
}