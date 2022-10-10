
import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number here:");

        //We can check if this number is Odd or Even

        int number = scanner.nextInt();
        String OddEven = (number % 2 == 0) ? "Odd" : "Even";


        System.out.println(number + " is " + OddEven);
    }
}
