import java.util.Scanner;

public class CommissionRate
{
    public static void main(String[] args)
    {
     double commission = 0.0;
     int rate = 0,sale;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sales Rs. : ");
        sale = scanner.nextInt();

        if (sale>= 50000) {
            rate = 35;
            commission = sale * 3.5;
        }
        if (sale>=30000)
        {
            rate = 20;
            commission = sale*2;
        }
        if (sale>=20000)
        {
            rate = 10;
            commission = sale*1;
        }
        if (sale>=10000)
        {
            rate = 5;
            commission = sale*0.5;
        }
        if (sale<10000)
        {
            rate = 2;
            commission = sale*0.2;
        }
        System.out.println("Commission amount = " + commission);
        System.out.println("Commission rate : " + rate + "%");
    }
}
