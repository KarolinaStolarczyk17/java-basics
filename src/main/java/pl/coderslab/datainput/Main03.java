package pl.coderslab.datainput;

import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getData(scanner);
        scanner.close();


    }

    public static void getData(Scanner scanner) {
        System.out.println("Podaj liczbę");
        int sum = 0;
        int liczba = pobierzLiczbe(scanner);
        while ( liczba!=0) {
            sum+=liczba;
            liczba=pobierzLiczbe(scanner);

        }
        System.out.println("Wynik " + sum);
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

// W pliku Main03.java stwórz metodę o sygnaturze:

//public static void getData().

//   Uzupełnij ciało metody tak, aby:

//   wczytywała liczby z konsoli do momentu wprowadzania 0 (ale nie włączając go do sumy liczb),
//   sumowała ich wartość oraz liczbę.
//   Wywołaj metodę w metodzie main.