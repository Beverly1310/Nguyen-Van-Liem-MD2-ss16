package bai8;

import java.util.Scanner;

public class Bai8 {
    private static void getLargestString(Scanner scanner) {
        System.out.println("Nhap chuoi can kiem tra: ");
        String inputString = scanner.nextLine();
        StringBuilder largestString = new StringBuilder();
        char maxChar = inputString.charAt(0);
        largestString.append(maxChar);
        for (int i = 1; i < inputString.length(); i++) {
            if (inputString.charAt(i) >= maxChar ) {
                maxChar = inputString.charAt(i);
                largestString.append(maxChar);
            }
        }
        System.out.println(largestString);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getLargestString(scanner);
    }
}

