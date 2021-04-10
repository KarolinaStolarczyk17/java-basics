package pl.coderslab.methods;

public class Main09 {

        public static void main(String[] args) {
            String hello = "Witaj ";
            String world = "Świecie!";
            String powitanie = hello + world; //łączenie dwóch napisów
            System.out.println(powitanie);

            String czesc = powitanie.substring(0, 6) + "uczniu";
            System.out.println(czesc);
        }
    }
