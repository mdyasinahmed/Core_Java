import java.util.*;

public class else_if{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int a = input.nextInt();

        System.out.print("Enter Number 2: ");
        int b = input.nextInt();

        if(a==b){
            System.out.println("Both are Equal!");
        }
        else if(a>b){
            System.out.println("A is Greater than B.");
        }
        else{
            System.out.println("B is Greater than A.");
        }
    }
}