import java.util.*;

public class factorial{
    public static void printFactorial(int n){
        if(n<0){
            System.out.println("Invalid Number.");
            return;
        }

        int fact = 1;

        for(int i=n; i>=n; i--){
            fact = fact* i;
        }

        System.out.println(fact);
        return;
    }

    // main function
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        printFactorial(n);
    }
}