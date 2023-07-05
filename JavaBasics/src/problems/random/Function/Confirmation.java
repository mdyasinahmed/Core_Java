import java.util.*;

public class Confirmation{
    public static void isEligible(int a){
        if(a>=18) System.out.println("Eligible to vote.");
        else System.out.println("Not Eligible to vote.");
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int age;
        System.out.print("Enter Your Age: ");
        age = scan.nextInt();

        isEligible(age);
    }
}