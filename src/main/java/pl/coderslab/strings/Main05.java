package pl.coderslab.strings;

public class Main05 {

    public static void main(String[] args) {
        String[] tab = {"jeden", "dwa", "trzy"};
            System.out.println(stringFromArray(tab));

        }
        static String stringFromArray(String[] str){
            String joined = String.join(" ", str);

            return joined;

        }


    }




