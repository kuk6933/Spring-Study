package hello.core.common;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        try {
            int ans = num / 10;
            System.out.println(ans);
        } catch (ArithmeticException ae) {
            System.out.println("Cannot divide by zero");
        }
    }
}


