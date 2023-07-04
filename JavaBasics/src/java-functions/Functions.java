import java.util.*;

public class Functions{
    // print a given name in Function
    public static void printName(String name){
        System.out.println("Hello, " + name + "!");
    }

    // main function
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        printName(str);
    }
}