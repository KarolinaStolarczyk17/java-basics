
package pl.coderslab.methods;
public class Main01
{    public static void main(String[] args) {

    int multipler = 3;
    int index=4;
    int multiply2 = multiply(3,4);
    System.out.println(multiply2);

}    public static int multiply(int multipler, int index) {
    int multiplyLocal = multipler*index;
    return multiplyLocal;
}
}