import java.util.*;

public class STRING{
    public static void main(String args[]){
        // Declaration
        String name = "Metro";
        String fullName = "Metro Plotan";
        String Sentence = "Metropolitan University";

        // dynamic string
        Scanner scan = new Scanner(System.in);

        String nickName = scan.next();
        System.out.println("Your Nickname is: " + nickName);

        String fullN = scan.nextLine();
        System.out.println("Your Full Name is: " + fullN);
    }
}