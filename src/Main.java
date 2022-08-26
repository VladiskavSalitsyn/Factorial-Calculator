import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();
        String Factorial = value + "!" + " = ";
        int n = value;

        for (int i = 1; i <= n; i = i + 1) {
            value = value * i;
            System.out.println(Factorial + value);
        }
    }
}