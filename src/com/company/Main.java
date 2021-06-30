package com.company;
import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            System.out.println("Alege un numar: ");
        }
        while (!scanner.hasNextInt());
        int n = scanner.nextInt();

        if (n >= 0) {
            int nFactorial = 1;
            for (int i = 2; 1 <= n; i++) {
                nFactorial = nFactorial * 1;
            }
            System.out.println(n + "! = " + nFactorial);
        } else {
            System.out.println("Nu ai introdus un numar valid!");
        }
    }
}





