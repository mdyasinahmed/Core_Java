import java.util.*;
//import java.util.Scanner;

public class Main{
    public static void main(String args[]){
         // this is java single line comment
        /**
         * this is java multiline comment
         */
        // printing in java
        System.out.println("Hello World!");
        System.out.print("Hello World\n");

        //input-output
        Scanner scan = new Scanner(System.in);

        // scanning name and age
        System.out.println("Scanning Name and Age: ");
        String name = scan.nextLine();;
        int age = scan.nextInt();

        System.out.println(name);
        System.out.println(age);

        // sum of 2
        System.out.println("Enter 2 Numbers to Get Sum: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = a + b;
        System.out.println("Sum of 1 Numbers: " + sum);

        // Conditionals in Java
        // if-else
        if(age>18){
            System.out.println("You can vote.");
        }else{
            System.out.println("You're not available to vote.");
        }

        // else if in Java
        if(a>b){
            System.out.println("A is Greater than B");
        }else if(b>a){
            System.out.println("B is Greater than A");
        }else{
            System.out.println("Both are Equal.");
        }

        // nested else if in Java
        if(a==b){
            System.out.println("Equal");
        }else{
            if(a>b){
                System.out.println("a is Greater.");
            }else{
                System.out.println("b is Greater");
            }
        }

        // Conditionals : Switch

        switch(age){
            case 18: System.out.println("You're Just " + age);
            break;

            case 20: System.out.println("You're Just " + age);
            break;

            case 22: System.out.println("You're Just " + age);
            break;

            default : System.out.println("No Comments.");
        }

        // Loops in Java
        // for loop in Java
        // declaration:
            // for(initialization; conditions; counter-update){
            //     // statements
            // }

        System.out.println("Example of for loop:");
        for(int i = 0; i<5; i++){
            System.out.println(i);
        }

        // while loop in Java
        // declaration:
            // initialization;
            // while(conditions){
            //      statements
            //      counter-update
            // }

        System.out.println("Example of while loop:");
        int count = 0;
        while(count<10){
            System.out.println(count);
            count++;
        }
        // do while loop in Java
        // declaration:
            // initialization;
            // do{
            //      statements
            //      counter-update
            // }while(conditions);

        System.out.println("Example of do-while loop:");
        int n = 0;
        do{
            System.out.println(n);
            n++;
        }while(n<15);

        // for each loop in Java
        /**
         * Declaration 
         * for(dataType item : array){
                ...
            }
         */
        // an array of numbers
        int[] numbers = {3, 4, 5, -5, 0, 12};
        int full_sum = 0;

        for(int number: numbers) {
            full_sum += number;
        }
        
        System.out.println("Sum = " + full_sum);
        
    }
}