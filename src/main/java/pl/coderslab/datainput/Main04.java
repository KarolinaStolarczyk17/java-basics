package pl.coderslab.datainput;

import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        rowsColumns(scanner);
        scanner.close();
    }

    public static void rowsColumns(Scanner scanner) {
        System.out.println("Podaj pierwszą liczbę");
        int rows = pobierzLiczbe(scanner);
        System.out.println("Podaj drugą liczbę");
        int columns = pobierzLiczbe(scanner);

        int[][] nowaTablica = new int[rows][columns];
        int n = 0;
        for (int i = 0; i < nowaTablica.length; i++) {
            for (int j = 0; j < nowaTablica[i].length; j++) {
                nowaTablica[i][j] = n;
                n++;
            }
        }

        int suma = 0;
        for (int i = 0; i < nowaTablica.length; i++) {
            for (int j = 0; j < nowaTablica[i].length; j++) {
                suma += nowaTablica[i][j];
            }
        }
        double srednia = suma / (rows * columns);
        System.out.println(suma);
        System.out.println(srednia);
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


//  W pliku `Main04.java` stwórz metodę o sygnaturze:

//   `public static void rowsColumns()`, która:

//  1. wczyta z konsoli 2 liczby całkowite i przypisze je do zmiennych `rows` i `columns`,
//  2. stworzy tablicę o podanej liczbie wierszy i kolumn,
//  3. wypełni tablicę kolejnymi liczbami całkowitymi,
//4. obliczy i wyświetli na konsoli sumę wszystkich elementów,
//  5. obliczy i wyświetli na konsoli średnią wszystkich elementów.
// Wywołaj metodę w metodzie `main`.