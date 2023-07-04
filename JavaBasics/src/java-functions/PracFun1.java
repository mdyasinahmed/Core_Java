import java.util.*;

public class PracFun1{
    // Add 2 numbers and return the sum
    public static int CalculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    //main function
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 2 Numbers: ");
        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.println("Sum of the Numbers is: "+CalculateSum(x,y));
    }
}