import java.util.*;
// import java.util.Scanner;

public class inoutJava{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int a, b, sum;
        System.out.print("Enter 2 Numbers: ");
        a = scan.nextInt();
        b = scan.nextInt();

        sum = a + b;
        System.out.println(sum);

    }
}