import java.util.*;

public class Power{
    public static int findPower(int x, int n){
        int sum = 1;
        for(int i=1; i<=n; i++){
            sum *= x;
        }

        return sum;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a, b, result;
        a = scan.nextInt();
        b = scan.nextInt();
        result = findPower(a,b);
        System.out.println(result);
    }
}