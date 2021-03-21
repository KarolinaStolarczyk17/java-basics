package pl.coderslab.cutstrings;

public class Main03 {

    public static void main(String[] args) {

        String str = " To jest tekst do ";
        System.out.println(countTokens(str));
    }

    public static int countTokens(String str) {

        String trime = str.trim();
        String[] parts = trime.split(" ");
        return parts.length;
    }
}

