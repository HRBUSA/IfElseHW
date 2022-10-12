import java.util.Scanner;

public class StudentMarkSheet
{
    // global static variables
    static int total ;
    static double marks;
    static double percentage;

    static int RollNo;
    public static void studentMarksheet(String name, int RollNo, int maths, int sci, int eng){

        // RollNumber = Om 1 + Jay 2 + Jagdish 3;
        total = maths + sci + eng;
        percentage = total/3;

        System.out.println(name +  " & RollNo = " + RollNo + " & Total Marks = " + total + " & Percentage = " + percentage);
    }

    public static void main(String[] args)
    {
        int marks;
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        marks = scanner.nextInt();

        studentMarksheet("Om", 1, 70, 88, 70);
        if (percentage>=80){
            System.out.println("You got A+:");
        }
        else{
            System.out.println("You are fail:");
        }
        studentMarksheet("Jay" ,  2, 80, 81, 76);
        if (percentage>=35){
            System.out.println("You are pass:");
        }
        else{
            System.out.println("You are fail:");
        }
        studentMarksheet("Jagdish" , 3, 75, 80, 80);
        if (percentage>=35){
            System.out.println("You are pass:");
        }
        else{
            System.out.println("You are fail:");
        }
    }
}
