import java.util.Scanner;

public class Hello{
	public static void main(String[] args){
		System.out.println("Enter 2 Values: ");
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt(), b = scan.nextInt();
		int sum = a + b;
		System.out.println("Sum of 2 Numbers = " + sum);
		
	}
}