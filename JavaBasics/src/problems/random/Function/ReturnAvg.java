import java.util.*;

public class ReturnAvg{
    public static int Average(int a, int b, int c){
        int average = (a+b+c)/3;
        return average;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int x, y, z, result;

        System.out.print("Enter 3 Numbers: ");
        x = scan.nextInt();
        y = scan.nextInt();
        z = scan.nextInt();

        result = Average(x,y,z);
        System.out.println("Average of 3 Number is: " + result);
    }
}