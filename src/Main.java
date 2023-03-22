import jdk.jshell.execution.LocalExecutionControlProvider;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LeapChecker leapChecker = new LeapChecker();
        System.out.println("Введите год:");
        leapChecker.setCurrentYear(scanner.nextInt());

        if (leapChecker.isLeapYear()) {
            System.out.println("Високосный год: " + "12.09." + leapChecker.getCurrentYear());
        } else System.out.println("Не високосный год: " + "13.09." + leapChecker.getCurrentYear());
    }
}