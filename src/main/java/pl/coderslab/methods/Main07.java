package pl.coderslab.methods;

public class Main07 {

    public static void main(String[] args) {
        String number;
        number = checkEvenOdd(2);

        System.out.println(number);


    }
    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return " Even";
        } else
            {
                return " Odd";
        }
    }
}