import java.util.Scanner;

public class ConSwitch{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Press the Button(1/2/3): ");
        int button = input.nextInt();

        switch(button){
            case 1: System.out.println("Speed Increased 1X.");
            break;
            case 2: System.out.println("Speed Increased 2X.");
            break;
            case 3: System.out.println("Speed Increased 3X.");
            break;
            default: System.out.println("Wrong Button Pressed.");
        }

    }
}