import java.util.*;

public class LinearSearch{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int size = scan.nextInt();

        int arr[] = new int[size];

        // scanning array
        for(int i=0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        // searching value input
        System.out.print("Enter Searching Value: ");
        int x = scan.nextInt();

        // printing index
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                System.out.println(x + " is found at Index " + i);
            }
        }
    }
}