import java.util.*;

public class GreaterAmongTwo{
    public static int Greater(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int x, y, result;

        System.out.print("Enter Two Numbers: ");
        x = scan.nextInt();
        y = scan.nextInt();
        result = Greater(x,y);

        System.out.println("Greater Among Two is " + result);
    }
}