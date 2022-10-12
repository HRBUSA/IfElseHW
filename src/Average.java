import java.util.Scanner;

public class Average
{
    public static void main(String[] args) {

        int a,b,c,d,e;

        System.out.println("Enter any five numbers:");

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        e = scanner.nextInt();

        int sum = a+b+c+d+e;

        System.out.println("Total number : " + sum);

        double avg = sum/5.0;
        System.out.println("Average number : " + avg);
    }
}