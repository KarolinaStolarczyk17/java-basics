package pl.coderslab.methods;
public class Main03 {
    public static void main(String[] args) {
        double convertToUsd1 = convertToUsd(26);
        System.out.println(convertToUsd1);

    }

    public static double convertToUsd(double pln) {
 double przelicznik = pln / 4.04;
        return przelicznik;
    }
}