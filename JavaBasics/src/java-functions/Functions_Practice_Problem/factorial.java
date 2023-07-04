import java.util.*;

public class factorial{
    // main function
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        printFactorial(n);
    }


    public static void printFactorial(int n){
        if(n<0){
            return;
        }

        int fact = 1;

        for(int i=n; i>=n; i--){
            fact*=i;
        }

        System.out.println(fact);
        return;
    }
}