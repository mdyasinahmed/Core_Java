import java.util.*;

public class FUNCTIONS{
    public static printInfo(){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String x = scan.nextLine();
        int y = scan.nextInt();

        int result = printInfo(x, y);
        System.out.println(result);
    }
}