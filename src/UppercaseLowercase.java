import java.util.Scanner;

public class UppercaseLowercase {
    public static void main(String[] args) {

        char ch1, ch2;

        System.out.println("Enter any character");

        Scanner scanner = new Scanner(System.in);

        ch1 = scanner.next().charAt(0);

        if (ch1 >= 'A' && ch1 <= 'Z')
        {
            ch2 = Character.toLowerCase(ch1);
            System.out.println("Lowercase : " + ch1);
        }
        else
        {
            ch2 = Character.toUpperCase(ch1);
            System.out.println("Uppercase : " + ch2);

        }
    }
}