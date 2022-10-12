import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args) {
        int year = 1989;
        Scanner s = new Scanner(System.in);
        System.out.println("enter any year");
        year = s.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0) && (year != 100))
        {
            System.out.println(year + "is a leap year");
        } else
        {
            System.out.println("year is not a leap year");
        }
    }
}