import java.util.*;

public class PracFun1{
    // Add 2 numbers and return the sum
    public static void CalculateSum(int a, int b){
        int sum = a + b;
        System.out.println("Sum = "+sum);
    }

    //main function
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 2 Numbers: ");
        int x = scan.nextInt();
        int y = scan.nextInt();

        CalculateSum(x,y);
    }
}