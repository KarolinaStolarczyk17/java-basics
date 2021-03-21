package pl.coderslab.strings;

public class Main02 {

    public static void main(String[] args) {

        int p = charPos("cytryna", 'c');
        System.out.println(p);
    }
        public static int charPos(String str, char c){

int t = str.indexOf(c);
        return t;

    }

}
