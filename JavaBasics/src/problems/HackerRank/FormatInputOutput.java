import java.util.Scanner;

public class FormatInputOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("================================");
        for(int i=0;i<3;i++){
            String str = input.next();
            int a = input.nextInt();

            System.out.printf("%-15s%03d%n", str, a);
        }
        System.out.println("================================");
    }
}
