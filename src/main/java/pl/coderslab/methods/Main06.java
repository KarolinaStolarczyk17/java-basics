package pl.coderslab.methods;

public class Main06 {

    public static void main(String[] args) {
        boolean pelnoletni=checkMaturity(20);

        System.out.println(pelnoletni);

    }

    public static boolean checkMaturity(int age) {
        boolean pelnoletni = true;
        if(age<18){
            pelnoletni=false;

        }
        return pelnoletni;

    }
}

