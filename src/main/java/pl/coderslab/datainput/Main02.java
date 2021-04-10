package pl.coderslab.datainput;

import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        operations(scanner);
        scanner.close();
    }

    public static void operations(Scanner scanner) {
        System.out.println("Podaj  pierwszą liczbę");
        int liczba1 = pobierzLiczbe(scanner);
        System.out.println("Podaj drugą liczbe");
        int liczba2 = pobierzLiczbe(scanner);
        System.out.println("Wynik dodawania liczb to: " + (liczba1 + liczba2));
        System.out.println("Wynik odejmowania liczb to: " + (liczba1 - liczba2));
        System.out.println("Wynik mnożenia liczb to: " + (liczba1 * liczba2));
        System.out.println("Wynik dzielenie liczb to: " + (liczba1 / liczba2));
    }

    private static int pobierzLiczbe(Scanner scan) {
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.print("Nieprawidłowe dane. Podaj jeszcze raz:");
        }
        int number = scan.nextInt();
        return number;
    }
}
//W pliku Main02.java stwórz metodę o sygnaturze:
//
//public static void operations().
//
//Uzupełnij ciało metody tak, by wczytała 2 liczby, a następnie wyświetliła na konsoli wyniki:
//
//dodawania,
//odejmowania,
//mnożenia,
//dzielenia.
//Wywołaj metodę w metodzie main.