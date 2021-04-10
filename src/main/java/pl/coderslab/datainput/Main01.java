package pl.coderslab.datainput;

import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getInfo(scanner);
        scanner.close();
    }    public static void getInfo(Scanner scanner) {
        System.out.println("Podaj imie");
        String imie = scanner.nextLine();
        System.out.println("Podaj wiek");
        int wiek = pobierzLiczbe(scanner);
        System.out.println(imie + " ma " + wiek + " lat.");
    }    private static int pobierzLiczbe(Scanner scan) {
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.print("Nieprawidłowe dane. Podaj jeszcze raz:");
        }
        int number = scan.nextInt();
        return number;
    }
}


