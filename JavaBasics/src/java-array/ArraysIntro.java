public class ArraysIntro{
    public static void main(String args[]){
        // Declaring an Array
        //int[] marks = new int [3];
        int marks[] = new int [3];

        // Storing Array element
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;
        
        // Printing Array Manually
        /*
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        */

        // printing array dynamically
        for(int i = 0; i<3; i++){
            System.out.print(marks[i]+" ");
        }
    }
}