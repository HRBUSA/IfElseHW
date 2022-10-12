import java.util.Scanner;

public class EligibleForVote {
    public static void main(String[] args) {

        int age;

        System.out.println("Enter your age");

        Scanner scanner = new Scanner(System.in);

        age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Eligible for vote");
        } else
        {
            System.out.println("Not eligible for vote");
        }
    }
}
