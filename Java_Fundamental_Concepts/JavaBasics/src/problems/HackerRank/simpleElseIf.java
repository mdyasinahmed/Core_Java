import java.util.*;

public class simpleElseIf{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if(n%2==0){
            if((n>2) && (n<5) || n>20){
                System.out.println("Not Weird");
            }
            else{
                System.out.println("Weird");
            }
        }else{
            System.out.println("Weird");
        }
    }
}