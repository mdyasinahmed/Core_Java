import java.util.*;

public class TwoDArray{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Rows, Cols Size: ");
        int rows = scan.nextInt();
        int cols = scan.nextInt();

        int arr[][] = new int[rows][cols];

        // scanning array
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        // printing array
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i]+" "+arr[j]);
            }
        }
    }
}