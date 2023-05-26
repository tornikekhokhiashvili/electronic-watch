package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        // Divide seconds by 3600 to get hours, and use modulo operator to restrict it within 24 hours
        int hours = (seconds / 3600)%24;
        // Divide seconds by 60 to get minutes, and use modulo operator to restrict it within 60 minutes
        int minutes = (seconds / 60) % 60;
        // Calculate the remaining seconds after accounting for hours and minutes
        int remainingSeconds = seconds % 60;
//        String formattedTime= hours+":"+minutes+":"+remainingSeconds;
        String formattedTime = String.format("%d:%02d:%02d", hours, minutes, remainingSeconds);
        System.out.println(formattedTime);
    }
}