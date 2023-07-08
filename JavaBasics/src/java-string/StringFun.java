public class StringFun{
    public static void main(String args[]){
        // concatenation
        String s1 = "metro";
        String s2 = "politan";

        String full = s1 + s2;
        System.out.println(full);

        // length
        System.out.println("String Length is: " + full.length());

        // charAT
        // for(int i = 0; i<full.length; i++){
        //     System.out.println(full.charAt[i]);
        // }

        // Compare to :
        if(s1.compareTo(s2)==0){
            System.out.println("Strings Are Equal");
        }else{
            System.out.println("Strings Aren't Equal.");
        }

        // Substring
        String sentence = "Metroplitan University";
        String subSen = sentence.substring(12, sentence.length());
        System.out.println(subSen);
    }
}