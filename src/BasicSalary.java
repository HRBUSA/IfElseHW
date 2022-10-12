import java.util.Scanner;

public class BasicSalary
{
    public static void main(String[] args) {

        int basic;
        double HRA, DA, TA,PF,GP=0,NP=0;
        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name of an employee");

        basic = scanner.nextInt();

        System.out.println("Enter the basic salary");

        HRA = basic*10/100;
        DA = basic*8/100;
        TA = basic*9/100;
        PF = basic*20/100;
        GP = basic+DA+HRA;
        NP = GP-PF;

        System.out.println("Employee name");
        System.out.println("Gross Salary");
        System.out.println("Net Salary");



    }
}
