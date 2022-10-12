import java.util.Scanner;

public class Alphabets
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter any alphabets");


        for (char i='A';i<='Z';i++)
        {
            System.out.print(i + " ");
        }
    }
}
