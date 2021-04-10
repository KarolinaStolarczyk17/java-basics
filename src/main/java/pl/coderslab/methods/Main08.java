package pl.coderslab.methods;

public class Main08 {
        public static void main(String[] args) {

                int maximum = maxOfThree(10, 11, 12);
        System.out.println("Maksymalna kwota to " + maximum);


}
public static int maxOfThree( int num1, int num2,int num3) {
        int max = 0;
        int[] tab = {num1, num2, num3};
        for (int i = 0; i < tab.length; i++) {
                if (max < tab[i])
                        max = tab[i];

        }
        return max;
}
}




