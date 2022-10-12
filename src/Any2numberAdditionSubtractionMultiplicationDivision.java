import java.util.Scanner;

public class Any2numberAdditionSubtractionMultiplicationDivision
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number");
        double number1 = scanner.nextInt();

        System.out.println("Input second number");
        double number2 = scanner.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + (number1+number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1-number2));
        System.out.println(number1 + " * " + number2 + " = " + (number1*number2));
        System.out.println(number1 + " /" + number2 + " = " + (number1/number2));

    }
}
