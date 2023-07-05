import java.util.*;

public class CircleCircumference{
    public static Double PrintCircumference(Double r){
        Double Circumference = (2*3.1415*r);
        
        return Circumference;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        Double x, result;
        System.out.print("Enter the Radius value: ");
        x = scan.nextDouble();
        
        result = PrintCircumference(x);
        System.out.println("Circumference of Circle is: " + result);
    }
}