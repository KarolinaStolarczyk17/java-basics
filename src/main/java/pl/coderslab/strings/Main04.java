package pl.coderslab.strings;

public class Main04 {

    public static void main(String[] args) {
String str = "Coderslab Jak dobrze zaczac programowac";
        String search = "lab";
        System.out.println(containsStr(str,search));

    }

    static boolean containsStr(String str, String search) {
        boolean nalezy = str.contains(search);

        return nalezy;
    }

   }
//}
