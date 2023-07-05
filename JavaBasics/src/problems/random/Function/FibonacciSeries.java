import java.util.*;

public class FibonacciSeries{
    public static void printSeries(int n){
        int i, n1 = 0, n2 = 1;
        System.out.print(n1);
        System.out.print(" ");
        System.out.print(n2);
        System.out.print(" ");

        i = 0;
        do{
            int sum = n1 + n2;
            System.out.print(sum);
            System.out.print(" ");
            n1 = n2;
            n2 = sum;
            
            i++;
        }while(i<n);

    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = scan.nextInt();
        printSeries(number);
    }
}