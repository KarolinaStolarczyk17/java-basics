package pl.coderslab.methods;

public class Main05 {

    public static void main(String[] args) {
        double calculateNetto1 = calculateNetto(100, 0.23);
        System.out.println(calculateNetto1);

    }

    public static double calculateNetto(double gross, double vat) {
        double calculateNetto = (gross - (gross * vat));
        return calculateNetto;
//netto= brutto-(0,23*brutto)
    }
}