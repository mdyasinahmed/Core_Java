//Qs: Print sum of 1 to n using Loop

import java.util.*;

public class do_While{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}