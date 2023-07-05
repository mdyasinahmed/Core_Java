import java.util.*;

public class PrintOddSum{
    public static void OddSum(int n){
        int Sum = 0, i;
        for(i=1; i<=n; i++){
            if(i%2!=0){
                Sum += i;
            }
        }
        System.out.println("Sum of ODD: " + Sum);
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int x;
        System.out.print("Enter the value of N: ");
        x = scan.nextInt();

        OddSum(x);
    }
}