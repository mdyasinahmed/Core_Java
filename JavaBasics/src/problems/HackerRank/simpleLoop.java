import java.util.*;

public class simpleLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            int x = n * i;
            System.out.println("%d x %d = %d%n", n, i, x);
        }
    }
}
