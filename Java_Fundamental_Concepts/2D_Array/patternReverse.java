public class patternReverse{
    public static void main(String args[]) {
        System.out.println("Pattern from Decreasing Order: ");
        for(int i=5; i>=0; i--) {
            for(int j=i; j>=0; j--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}