import java.util.*;

public class InfiniteLoop{
    public static void printLoop(){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i>0);
    }

    public static void main(String args[]){
        printLoop();
    }
}