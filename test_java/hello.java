import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello World!");
		
		System.out.print("Enter a Number: ");
		int n = scan.nextInt();
		System.out.println("Multiplied Number by 5 : "+n*5);
	}
}