import java.util.*;

public class PracFun2{
    // function to return product of 2 multiply
    public static int Multiply(int a, int b){
        return a*b;
    }
    //main function
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int result = Multiply(num1,num2);
        System.out.println(result);
    }
}