package pl.coderslab.strings;

public class Main03 {

    public static void main(String[] args) {
        String firsthalff = firstHalf("Coderslab");
        System.out.println(firsthalff);


    }

    static String firstHalf(String str){
        String subText = str.substring(0,str.length()/2);
        return subText;
    }

}
// Uzupełnij ciało metody tak, aby zwracała połowę napisu (uwzględniamy tylko część całkowitą podziału). Przykład: dla napisu CodersLab zwróci Code.
// public static String firstHalf(String str).