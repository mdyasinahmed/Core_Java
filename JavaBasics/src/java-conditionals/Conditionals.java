import java.util.Scanner;
// import java.util.*;

public class Conditionals{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        // checks if number is less than 0
        if(number > 18) {
            System.out.println("Adult");
        }else{
            System.out.println("Children");
        }
    }
}