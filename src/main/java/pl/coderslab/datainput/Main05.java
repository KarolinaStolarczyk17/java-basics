package pl.coderslab.datainput;

import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        textLines(scanner);
        scanner.close();
    }

    private static void textLines(Scanner scanner) {
        System.out.println("Podaj text");
        String text = scanner.next();
        while (!text.equals("quit")) {
            System.out.println(text);
            text = scanner.nextLine();

        }
    }
}

//  W pliku Main05.java stwórz metodę o sygnaturze:

//public static void textLines(),

// która wczyta kolejne linie tekstu z konsoli,a następnie je wyświetli.

//  Program ma zakończyć działanie po wpisaniu quit (ale już bez wyświetlania go na konsoli).

//     Wywołaj metodę w metodzie main.