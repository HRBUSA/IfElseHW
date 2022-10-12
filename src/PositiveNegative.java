import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        int n;
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        if (n > 0) {
            System.out.println("+ve number");
        }
        else if (n < 0)
        {
            System.out.println("-ve number");
        }
        else
        {
            System.out.println("+ve number or -ve number");
        }
    }
}