package pl.coderslab.datainput;

import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        nettoBrutto(scanner);
        scanner.close();
    }

    public static void nettoBrutto(Scanner scanner) {
        while (true) {
            System.out.println("Brutto-Netto(bn) czy Netto-Brutto(nb)");
            String tekst = scanner.nextLine();
            double podatek = 1.23;
            if (tekst.equals("nb")) {
                System.out.println("Podaj wartośc Netto");
                double netto = scanner.nextInt();
                double noweBrutto = netto * podatek;
                System.out.println("Kwota Brutto wynosi: " + noweBrutto);
                break;
            } else if (tekst.equals("bn")) {
                System.out.println("Podaj wartośc Brutto");
                double brutto = scanner.nextInt();
                double noweNetto = brutto / podatek;
                System.out.println("Kwota Brutto wynosi: " + noweNetto);
                break;
            } else
                System.out.println("Brutto-Netto(bn) czy Netto-Brutto(nb)");

        }
    }
}
