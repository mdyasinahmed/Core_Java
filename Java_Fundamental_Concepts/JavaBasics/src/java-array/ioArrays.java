import java.util.*;

public class ioArrays{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int size = scan.nextInt();

        int arr[] = new int[size];

        // scanning array
        for(int i=0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        // printing array
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}