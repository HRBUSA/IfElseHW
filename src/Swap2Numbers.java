import java.util.Scanner;

public class Swap2Numbers
{
    public static void main(String[] args) {
        int A, B, H ;// A and B are to swap with eachother
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of A and B");
        A = scanner.nextInt();
        B = scanner.nextInt();
        System.out.println("before swapping numbers: "+ A +"  "+ B);
        //swapping
        H = A;
        A = B;
        B = H;
        System.out.println("After swapping: "+ A +"   " + B);
        System.out.println( );
    }
}

