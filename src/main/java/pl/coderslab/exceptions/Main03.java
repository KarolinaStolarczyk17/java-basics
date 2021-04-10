package pl.coderslab.exceptions;

public class Main03 {

    public static void main(String[] args) {
        try {
            showLength(null);
        }catch (NullPointerException d){

        }
    }

    static void showLength(String s) {
        System.out.println(s.length());
    }

}
