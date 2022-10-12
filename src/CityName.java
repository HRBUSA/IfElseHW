import java.util.Scanner;

public class CityName
{
    public static void main(String[] args)
    {
      int n;

        System.out.println("Enter code of city");

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        switch (n)
        {
            case 0: System.out.println("GANDHINAGAR");
            break;

            case 1: System.out.println("Mumbai");
            break;

            case 2: System.out.println("Surat");
            break;

            case 3: System.out.println("Bhavnagar");
            break;

            case 4: System.out.println("Rajkot");
            break;

            case 5: System.out.println("Baroda");
            break;

            case 6: System.out.println("Bristol");
            break;

            case 7: System.out.println("Stuttgart");
            break;
        }
    }
}
