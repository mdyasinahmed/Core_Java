import java.util.*;

public class nestedCon{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Double n1, n2, n3, l_num;
        System.out.print("Enter 3 Numbers: ");
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        n3 = input.nextDouble();

        // checks if n1 is greater than or equal to n2
        if(n1 >= n2){
            if(n1 >= n3){
                l_num = n1;
            }else{
                l_num = n3;
            }
        }else{
            if(n2 >= n3){
                l_num = n2;
            }else{
                l_num = n3;
            }
        }

        System.out.println("Largest Number: " + l_num);
    }
}