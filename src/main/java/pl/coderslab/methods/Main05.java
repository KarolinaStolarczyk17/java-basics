package pl.coderslab.arrays;

//package pl.coderslab.homeworks.arrays;
import java.util.Arrays;

public class Main05
{
    public static int[] returnUnique(int[] arr) {
        int[] arr1 = new int[arr.length];
        int iloscUnicalnuch = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean flagUnicalnosti = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    flagUnicalnosti = false;
                    break;

                }
            }
            if (flagUnicalnosti) {
                arr1[iloscUnicalnuch] = arr[i];
                iloscUnicalnuch++;
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 3, 4};
        int[] arr2 = new int[arr1.length];
        arr2 = returnUnique(arr1);
        System.out.println(Arrays.toString(arr2));
    }
}