// Print sum of 1 to n using Loop
import java.util.*;

public class whileLoop{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();

        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}