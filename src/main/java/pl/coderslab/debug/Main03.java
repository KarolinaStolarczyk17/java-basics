package pl.coderslab.debug;

public class Main03 {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        for (int i = 1000; i >= 0; i--) {
            b = i < 9995 ? a / i : a * i;
        }
        System.out.println(b);

    }
}
// następnie uruchom program w trybie debugowania.
//
//wznawiaj program kilka razy, a następnie go zatrzymaj,
//zmodyfikuj breakpoint nadając mu warunek i<3,
//debuguj ponownie program, do momentu wystąpienia wyjątku,
//pozostaw program z błędem.